import static org.irods.jargon.core.utils.IRODSDataConversionUtil.escapeSingleQuotes;
import irods.efs.plugin.Activator;
import junit.framework.Assert;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.IRODSGenQueryExecutor;
import org.irods.jargon.core.pub.io.IRODSFile;
import org.irods.jargon.core.pub.io.IRODSFileFactory;
import org.irods.jargon.core.query.IRODSGenQuery;
import org.irods.jargon.core.query.IRODSQueryResultRow;
import org.irods.jargon.core.query.IRODSQueryResultSet;
import org.irods.jargon.core.query.JargonQueryException;
import org.irods.jargon.core.query.RodsGenQueryEnum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Copyright 2011 The University of North Carolina at Chapel Hill
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Gregory Jansen
 *
 */
public class FetchInfoTest {
    String testDirPath = "/cdrTestZone/home/count0/staging/fetchInfoTest";
    String testFilePath = "/cdrTestZone/home/count0/staging/fetchInfoTest/file.txt";
    IRODSAccount account = new IRODSAccount("cdr-dev-vault.libint.unc.edu", 5555, "count0", "Pa5sheed", "",
		    "cdrTestZone", "fake");
    // the host above is running iRODS server 2.3, but it is unreachable off campus

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
	// create the directory and the file
	try {
	    IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
	    IRODSFileFactory iff = irodsFileSystem.getIRODSAccessObjectFactory().getIRODSFileFactory(this.account);
	    IRODSFile dir = iff.instanceIRODSFile(testDirPath);
	    if (!dir.exists())
		dir.mkdirs();
	    IRODSFile f = iff.instanceIRODSFile(testFilePath);
	    if (!f.exists())
		f.createNewFile();
	} catch (Exception e) {
	    throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Problem connecting to IRODS", e));
	}
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    //@Test
    public void testFetchInfoManyTimes() {
	for (int i = 0; i < 100; i++) {
	    // get connection and file
	    IRODSFile f = null;
	    try {
		IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
		IRODSFileFactory iff = irodsFileSystem.getIRODSFileFactory(this.account);
		f = iff.instanceIRODSFile(this.testDirPath);
	    } catch (Exception e) {
		Assert.fail(e.getLocalizedMessage());
	    }
	    System.out.println("result from decoded path of: " + this.testDirPath);

	    if (!f.exists()) {
		Assert.fail("This directory should exist");
		// log.debug("fetchInfo found a file that doesn't exist in iRODS");
	    }
	    if (f.isDirectory()) {
		// log.debug("fetchInfo says a DIR " + uri.toASCIIString());
		// result.setDirectory(true);
		fetchDirInfo();
	    } else {
		Assert.fail("This is a directory, not a file.");
		// log.debug("fetchInfo says a FILE " + uri.toASCIIString());
		// result.setDirectory(false);
		// fetchDataInfo(result, monitor);
	    }
	}
    }

    /**
     * @return
     */
    private void fetchDirInfo() {
	// build query
	IRODSGenQueryExecutor irodsGenQueryExecutor;
	try {
	    StringBuilder q = new StringBuilder();
	    q.append("select ");
	    q.append(RodsGenQueryEnum.COL_COLL_ID.getName()).append(", ");
	    q.append(RodsGenQueryEnum.COL_COLL_NAME.getName()).append(", ");
	    q.append(RodsGenQueryEnum.COL_COLL_MODIFY_TIME.getName());
	    q.append(" where ");
	    q.append(RodsGenQueryEnum.COL_COLL_NAME.getName());
	    q.append(" = '").append(escapeSingleQuotes(this.testDirPath)).append("'");

	    IRODSGenQuery irodsQuery;
	    IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
	    IRODSAccessObjectFactory aof = irodsFileSystem.getIRODSAccessObjectFactory();
	    irodsQuery = IRODSGenQuery.instance(q.toString(), 1);

	    // execute query
	    irodsGenQueryExecutor = aof.getIRODSGenQueryExecutor(account);
	    IRODSQueryResultSet resultSet = irodsGenQueryExecutor.executeIRODSQueryAndCloseResult(irodsQuery, 0);

	    // set the file info object from the query result
	    IRODSQueryResultRow r = null;
	    r = resultSet.getFirstResult();
	    //info.setExists(true);
	    String modified = r.getColumn(RodsGenQueryEnum.COL_COLL_MODIFY_TIME.getName());
	    Integer.parseInt(modified);
	    // remove path
	    String collName = r.getColumn(RodsGenQueryEnum.COL_COLL_NAME.getName());
	    if ("/".equals(collName)) {
		//info.setName("");
	    } else {
		//info.setName(collName.substring(collName.lastIndexOf("/") + 1));
	    }
	    //info.setAttribute(EFS.ATTRIBUTE_ARCHIVE, false);
	    //info.setAttribute(EFS.ATTRIBUTE_EXECUTABLE, false);
	    //info.setAttribute(EFS.ATTRIBUTE_HIDDEN, false);
	    //info.setAttribute(EFS.ATTRIBUTE_READ_ONLY, false);
	    //info.setAttribute(EFS.ATTRIBUTE_SYMLINK, false);
	} catch (JargonException e) {
	    throw new Error(e);
	} catch (JargonQueryException e) {
	    throw new Error(e);
	}
    }

    @Test
    public void testGenQueryResults() {
	String testFileName = this.testFilePath.substring(this.testFilePath.lastIndexOf("/") + 1);
	try {
	    // build query
	    StringBuilder q = new StringBuilder();
	    q.append("select ");
	    q.append(RodsGenQueryEnum.COL_DATA_NAME.getName()).append(", ");
	    q.append(RodsGenQueryEnum.COL_D_DATA_ID.getName()).append(", ");
	    q.append(RodsGenQueryEnum.COL_D_MODIFY_TIME.getName()).append(", ");
	    q.append(RodsGenQueryEnum.COL_DATA_SIZE.getName());
	    q.append(" where ");
	    q.append(RodsGenQueryEnum.COL_COLL_NAME.getName());
	    q.append(" = '").append(escapeSingleQuotes(this.testDirPath)).append("'");
	    q.append(" and ");
	    q.append(RodsGenQueryEnum.COL_DATA_NAME.getName());
	    q.append(" = '").append(escapeSingleQuotes(testFileName)).append("'");

	    System.out.println("fetchDataInfo query: " + q.toString());

	    IRODSGenQuery irodsQuery;
	    IRODSFileSystem irodsFileSystem = IRODSFileSystem.instance();
	    IRODSAccessObjectFactory aof = irodsFileSystem.getIRODSAccessObjectFactory();
	    irodsQuery = IRODSGenQuery.instance(q.toString(), 1);

	    // execute query
	    IRODSGenQueryExecutor irodsGenQueryExecutor = aof.getIRODSGenQueryExecutor(account);
	    IRODSQueryResultSet resultSet = irodsGenQueryExecutor.executeIRODSQuery(irodsQuery, 0);

	    // set the file info object from the query result
	    IRODSQueryResultRow r = resultSet.getFirstResult();
	    String modified = r.getColumn(RodsGenQueryEnum.COL_D_MODIFY_TIME.getName());
	    //String modified = r.getColumn(3);
	    Integer.parseInt(modified); // millisecond timestamp
	    String size = r.getColumn(RodsGenQueryEnum.COL_DATA_SIZE.getName());
	    Integer.parseInt(size);
	    irodsGenQueryExecutor.closeResults(resultSet);
	} catch (JargonException e) {
	    throw new Error(e);
	} catch (JargonQueryException e) {
	    throw new Error(e);
	}
    }

}
