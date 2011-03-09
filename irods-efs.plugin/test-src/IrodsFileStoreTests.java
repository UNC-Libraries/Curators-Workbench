import static org.junit.Assert.fail;
import irods.efs.plugin.Activator;
import irods.efs.plugin.IrodsFileStore;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.filesystem.IFileInfo;
import org.eclipse.core.filesystem.provider.FileInfo;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.io.IRODSFile;
import org.irods.jargon.core.pub.io.IRODSFileFactory;
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
public class IrodsFileStoreTests {

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
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for
     * {@link irods.efs.plugin.IrodsFileStore#childNames(int, org.eclipse.core.runtime.IProgressMonitor)}
     * .
     */
    @Test
    public void testChildNames() {
	fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link irods.efs.plugin.IrodsFileStore#fetchInfo(int, org.eclipse.core.runtime.IProgressMonitor)}
     * .
     *
     * @throws URISyntaxException
     */
    @Test
    public void testFetchInfo() throws URISyntaxException {
	{
	    IrodsFileStore filestore = new IrodsFileStore(new URI(
			    "irods://cdrservices@localhost:1247/count0Zone/home/count0/tests/nothing%20here.txt"));
	    IFileInfo info = filestore.fetchInfo();
	    Assert.isTrue(info.exists() == false, "IFileInfo.exists() must be false for non-existent file");
	}

	{
	    IrodsFileStore dirstore = new IrodsFileStore(new URI(
			    "irods://cdrservices@localhost:1247/count0Zone/home/count0/tests/nothing%20here/"));
	    IFileInfo dirinfo = dirstore.fetchInfo();
	    Assert.isTrue(dirinfo.exists() == false, "IFileInfo.exists() must be false for non-existent directory");
	}

	{ // now without preset username!
	    IrodsFileStore dirstore = new IrodsFileStore(new URI(
			    "irods://localhost:1247/count0Zone/home/count0/tests/nothing%20here/"));
	    IFileInfo dirinfo = dirstore.fetchInfo();
	    Assert.isTrue(dirinfo.exists() == false, "IFileInfo.exists() must be false for non-existent directory");
	}
    }

    /**
     * Test method for
     * {@link irods.efs.plugin.IrodsFileStore#openInputStream(int, org.eclipse.core.runtime.IProgressMonitor)}
     * .
     */
    @Test
    public void testOpenInputStream() {
	fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link irods.efs.plugin.IrodsFileStore#delete(int, org.eclipse.core.runtime.IProgressMonitor)}
     * .
     */
    @Test
    public void testDelete() {
	fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link irods.efs.plugin.IrodsFileStore#mkdir(int, org.eclipse.core.runtime.IProgressMonitor)}
     * .
     */
    @Test
    public void testMkdir() {
	fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link irods.efs.plugin.IrodsFileStore#openOutputStream(int, org.eclipse.core.runtime.IProgressMonitor)}
     * .
     */
    @Test
    public void testOpenOutputStream() {
	fail("Not yet implemented"); // TODO
    }

}
