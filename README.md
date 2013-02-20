Command-line Build Instructions
-------------------------------
The build is maven-based, assisted by a set of Eclipse build plugins called [Tycho](http://tycho.sonatype.org/).
The maven plugin repository for Tycho and all it's particulars are configured in the parent pom.xml file in this directory. Maven 3 and Java are required.
The distributable ZIP files and update site are all created in one maven command:
* mvn install

Developer Eclipse IDE Setup
---------------------------

1. Install Eclipse bundles:
 * Eclipse Modelling Project feature or product (download) (this includes RCP/PDE bundles)
 * m2eclipse plugin and connectors, see Maven > Discovery in preferences
  * Tycho Configurator m2eclipse connector
  * m2e-egit Maven SCM Handler for EGit 
1. Import Maven Projects from SCM
1. Select git and this project URL.
1. Open the current target-definition file. (As on this writing, target-definition\indigo_3_8.target)
1. Click on "Set as Target Platform" in the upper right.
1. PDE > Update Project Classpath..
