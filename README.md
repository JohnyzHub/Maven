# Maven

	POM : A Project Object Model(POM) is the fundamental unit of work in Maven. 
		It is an XML file that contains information about the project 
		and configuration details used by Maven to build the project

	Artifact	: Artifact is a file(usually JAR) that gets deployed to a Maven repository.
				Each artifact contains a groupid, artifactid and version number.

	GROUPID		: Groupid is an unique identifier of the project across all projects in a gien maven repository.
	ARTIFACTID	: Artifiact id is the name of the jar in lower case letters. 
	VERSION		: Number of the distribution
	PLUGIN		: Plugin performs a course of action on project in maven. Eg: mvn clean, mvn package


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


	   PLUGIN	        		DESCRIPTION
	   ---------			-----------------------------------------	

	    CLEAN	        	Clean up after the build.

	    COMPILE	    		Compiles Java sources.

	    DEPLOY	      		Deploy the built artifact to the remote repository.

	    INSTALL	      		Install the built artifact into the local repository.

	    RESOURCES	    		Copy the resources to the output directory for including in the JAR

	    SITE	        	Generate a site for the current project.

	    Test			Run tests

	    SUREFIRE	    		Run the JUnit tests in an isolated class loader.

	    SUREFIRE-REPORT	  	Generate a report based on the results of unit tests.

	    SHADE	         	Build an Uber-JAR from the current project, including dependencies.

	    SOURCE	      		Build a source-JAR from the current project.

	    ASSEMBLY	    		Build an assembly (distribution) of sources and/or binaries


	-----------------------------------------------------------------------


  
