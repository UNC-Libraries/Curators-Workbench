Command-line Build Instructions
-------------------------------
The build is maven-based, assisted by a set of Eclipse build plugins called [Tycho](http://tycho.sonatype.org/).
The maven plugin repository for Tycho and all it's particulars are configured in the parent pom.xml file in this directory.

Full build requires:
 * Maven 3
 * Java 7
 * Java 7 packages for each target platform (optional, for bundling JRE)

Building without bundling the Java Runtime Environment is easy:

    mvn package

The Java Runtime Environment (JRE) can be bundled within each distribution package. To perform a bundled build, you must first download and unpack the JRE folder for all the platforms into a directory structure as follows:

    bundledJREs
      |-linux-i586
      |   \jre1.7.0_25
      |-linux-x86
      |   \jre1.7.0_25
      |-windows-x86
      |   \jre1.7.0_25
      |-windows-i586
      |   \jre1.7.0_25
      \-macosx-x64
          \jre1.7.0_25.jre

Then the distribution packages and update site are all created in one maven command:

    mvn -DbundleJREs=true -DbundleJREs.dir=<full path of bundledJREs dir> package
    
The distribution packages can be found here after the build:

    <project base dir>/eclipse-repository/target/products

Developer Eclipse IDE Setup
---------------------------

1. Install Eclipse IDE and required plugins:
 * Eclipse Modelling Project feature or choose this product download (this includes RCP/PDE bundles)
 * m2eclipse plugin and connectors, see Maven > Discovery in preferences
  * Tycho Configurator m2eclipse connector
  * m2e-egit Maven SCM Handler for EGit 
1. Import Maven Projects from SCM
1. Select git and this project URL.
1. Open the current target-definition file. (As on this writing, target-definition\indigo_3_8.target)
1. Click on "Set as Target Platform" in the upper right.
1. To fix logging classpath markers, maven install these subprojects:
 * org.apache.log4j12
 * org.slf4j.log4j12
1. To enable PDE logging via SLF4J, maven install this one too:
 * org.slf4j.pde
