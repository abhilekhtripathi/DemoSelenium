package CollectionFramework;

public class CommonUseinSelenium 
{
/**
 * Common Use Cases in Selenium:
 * 
   Storing Multiple WebElements:
   
    Often, you'll need to work with multiple elements 
   (e.g., multiple buttons or links) on a page. Collections, particularly List<WebElement>, are used to store these elements.

    Example: Finding and storing multiple elements:
 * 
 * List<WebElement> buttons = driver.findElements(By.tagName("button"));
  for (WebElement button : buttons) {
    System.out.println(button.getText());
    }

 * 
 * 
 * _________________________________________________________________
 *  Using HashSet to Remove Duplicate Elements:or Jaha hm log getWindowhandles use krte toh set<String> returkrtah
 *  Set<String> uniqueTexts = new HashSet<>();
    List<WebElement> textElements = driver.findElements(By.className("text"));
     for (WebElement element : textElements) {
    uniqueTexts.add(element.getText()); // Set will automatically handle duplicates
     }
       System.out.println("Unique texts: " + uniqueTexts);

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
