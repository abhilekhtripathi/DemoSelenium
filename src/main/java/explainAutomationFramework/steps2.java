package explainAutomationFramework;

public class steps2 
{
  /**
 We are using a maven Project to manage all dependencies which our project requires and using testNg as framework. Along with testNg framework we are using Data Driven Approach using TestNg @DataProvider annotation so we can run our tests multiple times with different Data.

hashtag#Folder 1 (src/test/java) 📁

We have src/test/java folder where we have one package named hashtag#testcases and we are maintaining all our test case files (java files). Ex : LoginTest.java
We are using @Test Annotation for tests.

hashtag#Folder 2 (src/test/resources) 📁

Inside src/test/resources we have one package with name hashtag#utilities where we maintained our data.properties file containing url and username and password data. Our excel files are also present inside this utilities package.

hashtag#Folder 3 (src/main/java) 📁

👉 In this folder we have one package named hashtag#pageobjects where we stored all our locators for each webpage of our application.

👉 In this folder we have one package with name hashtag#baseTest inside this we have our base.java file from where we invoke our browsers, we are using the concept of ThreadLocal class for thread safety so we can run tests in parallel, also we are extending this base class in every tests. Also we are loading our properties file inside base class. Also we are using @BeforeSuite (for launching browsers ) and @AfterSuite (for closing browser)

👉 In this Folder we have the hashtag#listener
package too, inside that we have Listeners.java class that implements ITestListener interface so we can control flow of execution like taking screenshots for failed test case and attaching them with extent reports.

hashtag#extent reports we are using. We kept extent.properties file in src/test/resources folder 📁 

hashtag#testng.xml: This file we have maintained to run multiple tests also this file is properly configured in our pom.xml file using Maven Surefire Plugin so we can easily run our testng.xml from maven command. Note : Memorize how testng.xml file looks sometimes interviewer can ask you to write sample testng.xml file on notepad.

hashtag#Our Project is configured in jenkins we have provided our pom.xml path in jenkins and using mvn clean test command to run our test cases.

hashtag#github: we are maintaining all code in github. 🧑‍💻
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
