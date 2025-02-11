package ScenarioBasedSelenium;

public class WhereUseListSetConcept
{
/**
 *   ********List*********************
    A list is an ordered collection that allows duplicate elements. In Selenium, lists are commonly used to:
    Storing WebElements
    When you locate multiple elements using findElements(), they are returned as a List<WebElement>.
       
       List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
         System.out.println(link.getText());
               }
 * 
 * 
 * *****Set**********************
     A set is an unordered collection that does not allow duplicate elements. In Selenium, 
     sets are useful in scenarios where uniqueness is important.
     
     If you want to extract unique values from a list of elements (e.g., unique links, unique product names), you can use a set.
 * 
 *        Set<String> uniqueLinks = new HashSet<>();
          List<WebElement> links = driver.findElements(By.tagName("a"));

              for (WebElement link : links) {
               uniqueLinks.add(link.getText());
                 }

                      System.out.println("Unique links: " + uniqueLinks);
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
