package TestngQuestions;

public class RunSmokeTCsOnly 
{
         /**
          *    Option 1: Run Using testng.xml
               Right-click on the testng.xml file in your IDE (e.g., IntelliJ or Eclipse).
               Select Run As > TestNG Suite.

               Option 2: Run Using Maven
               Add the following configuration to your pom.xml file to run only the smoke group:
          * 
          * 
          * <build>
          <plugins>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M7</version> <!-- Use the latest version -->
            < configuration>
                <groups>smoke</groups> <!-- Include only smoke tests -->
                  </configuration>
               </plugin>
          </plugins>
    </build>
          * 
          * 
          * 
          * 
          * 
          * 
          * 
          * 
          * 
          * 
          */
}
