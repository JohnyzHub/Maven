# Maven
Maven Practice

Create Java Application:
	mvn archetype:generate
	    -DgroupId=<package name>
	    -DartifactId=<application name>
	    -Dversion=<version number>
	    -DarchetypeArtifactId=maven-archetype-quickstart
	    -DinteractiveMode=false

Create java web application:
	mvn archetype:generate
	    -DgroupId=<package name>
	    -DartifactId=<application name>
	    -Dversion=<version number>
	    -DarchetypeArtifactId=maven-archetype-webapp
	    -DinteractiveMode=false

List of Maven Plugins: https://maven.apache.org/plugins/index.html

Few frequently in-use maven plugins:


   PLUGIN	        DESCRIPTION
   ---------		-----------------------------------------	
		
    CLEAN	        Clean up after the build.

    COMPILE	    Compiles Java sources.

    DEPLOY	      Deploy the built artifact to the remote repository.

    INSTALL	      Install the built artifact into the local repository.

    RESOURCES	    Copy the resources to the output directory for including in the JAR

    SITE	        Generate a site for the current project.

    Test		Run tests
    
    SUREFIRE	    Run the JUnit tests in an isolated class loader.

    SUREFIRE-REPORT	  Generate a report based on the results of unit tests.

    SHADE	         Build an Uber-JAR from the current project, including dependencies.

    SOURCE	      Build a source-JAR from the current project.

    ASSEMBLY	    Build an assembly (distribution) of sources and/or binaries

    
-----------------------------------------------------------------------

Examples covered the below scenarios using various maven plugins and dependencies.
  1) WSDL to/from POJO using ANT
  
  2) Custom Plugin
  
  3) Multi Module
  
  4) WSDL to/from POJO using Maven Plugin
  
