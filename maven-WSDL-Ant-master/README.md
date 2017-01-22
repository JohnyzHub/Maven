# MavenWork-WSDL-Ant

Maven and ANT to convert WSDL to Java files.


    Fork this project to your desired folder in the local system.
    Open the project in eclipse IDE
    Perform below maven command:
        mvn eclipse:clean 
        mvn eclipse:eclipse
    Refresh the project and right click on project --> maven --> update project (ALT+F5)
      then execute  mvn generate-sources

      This generates Java files from WSDL file.

        if you face any issues related accessability of JARs in during generate-sources command, like the one here:                   
                http://stackoverflow.com/questions/23011547/webservice-client-generation-error-with-jdk8
        create a file 'jaxp.properties' and place the entry 
        javax.xml.accessExternalSchema = all  
        save and close the file under {your jdk installation directory}/jre/lib 
        
        
