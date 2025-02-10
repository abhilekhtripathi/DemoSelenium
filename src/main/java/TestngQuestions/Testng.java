package TestngQuestions;

public class Testng 
{
	/**
	 * TestNG is a powerful testing framework inspired by JUnit and NUnit but designed to overcome some of their limitations. 
	 * It is widely used in Selenium automation for writing and executing test cases.
	 * Below is a detailed explanation of TestNG concepts in Selenium, along with examples and best practices.
	 * 
	 * 
	 * 
	 * Use's
	 *  1. Annotations
        TestNG uses annotations to define the behavior of test methods. Here are the most commonly used annotations:
Annotation	Description
@Test	Marks a method as a test case.
@BeforeMethod	Runs before each test method.
@AfterMethod	Runs after each test method.
@BeforeClass	Runs once before the first test method in the current class.
@AfterClass	Runs once after all test methods in the current class.
@BeforeSuite	Runs once before all tests in the suite.
@AfterSuite	Runs once after all tests in the suite.
@BeforeTest	Runs before any test method belonging to the <test> tag in testng.xml.
@AfterTest	Runs after all test methods belonging to the <test> tag in testng.xml.
@BeforeGroups	Runs before the first test method of a specific group.
@AfterGroups	Runs after the last test method of a specific group.
@DataProvider	Supplies test data to a test method.
@Parameters	Passes parameters to a test method from testng.xml
	 * 
	 * 
	 * 
	 * 2. Test Methods
    Test methods are defined using the @Test annotation. Example:
    @Test
    public void testLogin() {
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("login-button")).click();
    Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed!");
      }
	 * 
	 * 
	 * 3. Grouping Tests
      You can group test methods using the groups attribute in the @Test annotation. Example:
      @Test(groups = "smoke")
      public void testPageTitle() {
     driver.get("https://www.example.com");
     Assert.assertEquals(driver.getTitle(), "Example Domain");
           }

     @Test(groups = "regression")
     public void testElementPresence() {
    driver.get("https://www.example.com");
    WebElement heading = driver.findElement(By.tagName("h1"));
    Assert.assertTrue(heading.isDisplayed());
    }
	 * 
	 * 4. Parallel Execution
     TestNG allows you to run tests in parallel to save time. Example:
   <suite name="Suite" parallel="methods" thread-count="5">
    <test name="Test">
        <classes>
            <class name="SeleniumTestNGExample"/>
        </classes>
    </test>
   </suite>
	 * 
	 * 5. Data-Driven Testing
     TestNG supports data-driven testing using the @DataProvider annotation. Example:
     @Test(dataProvider = "loginData")
     public void testLogin(String username, String password) {
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.id("login-button")).click();
    Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed!");
       }

      @DataProvider(name = "loginData")
          public Object[][] provideLoginData() {
        return new Object[][]{
            {"standard_user", "secret_sauce"},
            {"locked_out_user", "secret_sauce"},
            {"problem_user", "secret_sauce"}
        };
          }
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
	 * 
	 */
	

}
