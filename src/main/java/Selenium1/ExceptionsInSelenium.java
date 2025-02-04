package Selenium1;

public class ExceptionsInSelenium 
{
	/**
	 * 
 1.NoSuchElementException
 Cause: Element is not found in the DOM.
 Possible Reasons:
 Incorrect locator (XPath, CSS, etc.)
 Element is not loaded yet (page load delay)
 Dynamic elements changing IDs



 2.StaleElementReferenceException
 Cause: The element reference becomes invalid after page refresh or DOM updates.
 Possible Reasons:
 Element is removed & reloaded dynamically.
 Page refreshes automatically (AJAX calls).



  3.TimeoutException
  Cause: The expected condition was not met within the wait time.
  Possible Reasons:
  Element not visible/clickable within the wait time.



   4.InvalidSelectorException
   Cause: The XPath or CSS Selector syntax is incorrect.
   Possible Reasons:
   Using invalid XPath format.



   5.SessionNotCreatedException
   Cause: The browser driver version does not match the installed browser version.
   Possible Reasons:
   ChromeDriver version outdated after a Chrome update.
   Incorrect Selenium-WebDriver version.
	 * 
	 * 

	 * 
	 * 
	 */

}
