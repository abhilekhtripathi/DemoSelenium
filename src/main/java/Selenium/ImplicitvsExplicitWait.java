package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitvsExplicitWait {

	public static void main(String[] args) {
		// https://www.amazon.in/
		/**
		 * 500 ms polling interval time for the both wait implicit and explicit wait 
		 * 
		 * *************Explicit Wait **********************
		 * Why Use Explicit Wait?
               Elements may take time to load, become clickable, or become visible.
               Prevents flaky tests by waiting only when needed.
               More efficient than Thread.sleep(), which always waits even if not required.
		 * 
		 * Ex:  
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitBtn")));
           button.click();
                 
		 * 
		 * ********Implicit Wait **************
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 *  Applies to all elements globally (once set, no need to specify again).
		 *  Stops waiting as soon as the element is found (does not always wait full time).
            Works only for finding elements (not for other conditions like clickability).
            Can cause flaky tests if used with Explicit Wait (use Explicit Wait instead for better cont
		 * 
		 * 
		 * ********Fluent Wait *********
		 * 
		 * FluentWait is similar to Explicit Wait, but allows We to:

                Set polling intervals (e.g., check every 500ms).
                Ignore exceptions like NoSuchElementException.
                
                
		 *               FluentWait<WebDriver> wait = new FluentWait<>(driver)
                          .withTimeout(Duration.ofSeconds(10))
                          .pollingEvery(Duration.ofMillis(500))
                          .ignoring(NoSuchElementException.class);
		 * 
		 * 
		 */

	}

}
