package ScenarioBasedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class TableDataValidateWithText {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://yourwebsite.com/page-with-table");

        // Locate the table element
        WebElement table = driver.findElement(By.id("tableId")); // Replace with actual locator

        // 1. Check if the table is displayed
        if (table.isDisplayed()) {
            System.out.println("Table is displayed.");
        } else {
            System.out.println("Table is not displayed.");
        }

        // 2. Check if table values are displayed
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                if (column.isDisplayed()) {
                    System.out.println("Cell value is displayed: " + column.getText());
                } else {
                    System.out.println("Cell value is not displayed.");
                }
            }
        }

        // 3. Check if table values text is correct
        String[][] expectedValues = {
            {"Header1", "Header2", "Header3"},
            {"Row1Col1", "Row1Col2", "Row1Col3"},
            {"Row2Col1", "Row2Col2", "Row2Col3"}
        };

        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columns.size(); j++) {
                String actualValue = columns.get(j).getText();
                String expectedValue = expectedValues[i][j];
                if (actualValue.equals(expectedValue)) {
                    System.out.println("Text is correct: " + actualValue);
                } else {
                    System.out.println("Text is incorrect. Expected: " + expectedValue + ", Actual: " + actualValue);
                }
            }
        }

        // Close the browser
        driver.quit();
    }
}
