package TestngQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Run5TestCasesForLogin
{
     
	
	WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1, groups = "smoke")
    public void testPageTitle() {
        driver.get("https://www.example.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Example Domain", "Page title does not match expected value.");
    }

    @Test(priority = 2, groups = "regression")
    public void testElementPresence() {
        driver.get("https://www.example.com");
        WebElement heading = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(heading.isDisplayed(), "Heading element is not present on the page.");
    }

    @Test(priority = 3, groups = "smoke")
    public void testLoginPositive() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"), "Login failed for valid credentials.");
    }

    @Test(priority = 4, groups = "regression")
    public void testLoginNegative() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        driver.findElement(By.id("password")).sendKeys("invalid_password");
        driver.findElement(By.id("login-button")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed for invalid login.");
    }

    @Test(priority = 5, groups = "smoke")
    public void testCurrentUrl() {
        driver.get("https://www.example.com");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.example.com/", "Current URL does not match expected value.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
	
}}
