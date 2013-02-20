Command-line Build Instructions
-------------------------------
The build is maven-based, assisted by a set of Eclipse build plugins called [Tycho](http://tycho.sonatype.org/).
The maven plugin repository for Tycho and all it's particulars are configured in the parent pom.xml file in this directory. Maven 3 and Java are required.
The distributable ZIP files and update site are all created in one maven command:
* mvn install

Developer Eclipse IDE Setup
---------------------------

1. Install Eclipse bundles:
 * the m2eclipse plugin
 * the Tycho Configurator m2eclipse connector (see Maven > Discovery in preferences)
 * the Eclipse Modelling Project feature (includes RCP/PDE bundles)
1. Import Maven Projects
1. PDE > Update Project Classpath..
