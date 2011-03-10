Build Instructions
==================

The build of the workbench is maven-based, with a set of special build plugins called [Tycho](http://tycho.sonatype.org/).

The snapshot repository for Tycho and all it's particulars are configured in the parent pom.xml file in this directory. Maven 3 and Java are required.

Install the Eclipse Publisher Patch for the Mac OS
--------------------------------------------------

There is a specially patched Eclipse plugin file that is needed for any Mac OS build at the moment. You will have to
deploy this file into your local maven repository manually. Take the following step:

Copy /etc/org.eclipse.equinox.p2.publisher_1.1.2.v201012021428.jar to the following location:
.m2/repository/org/sonatype/tycho/tycho-p2-runtime/0.11.0-SNAPSHOT/eclipse/plugins

.m2 above is the location of your own local Maven repository. The patched file will be used instead of the existing plugin.

Build the Product and Repository
--------------------------------

The distributable ZIP files and update site are all created in one maven command:

mvn install

or

mvn clean install 