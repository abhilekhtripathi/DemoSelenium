package Selenium;

public class FindElementVSElements 
{

	/**
	 * findelement
	 * for using Finds a single element.	
	 * return type is WebElement
	 * Returns the first matching element. Throws NoSuchElementException if none is found.
	 * 
	 *      WebElement element = driver.findElement(By.id("username"));
             element.sendKeys("testuser");

	 * 
	 * 
	 * findelements
	 * for using Finds multiple elements.
	 * return type 	List<WebElement>
	 * Returns all matching elements. Returns an empty list if none is found.
	 * 
	 * List<WebElement> elements = driver.findElements(By.className("button"));
       for (WebElement element : elements) {
       System.out.println(element.getText());
                           }

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
