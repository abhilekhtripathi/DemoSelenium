package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindBookOnScroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		System.out.println("the parent window title is :" + driver.getTitle());

		driver.manage().window().maximize();// maximize the window

		driver.findElement(By.xpath("xpath of the checkbox/radio button")).isSelected();// checkbox / radio is selected
																						// or not

		Actions act = new Actions(driver); // Perform the right click
		// act.moveToElement("button").perform();
		act.contextClick().perform();

		// Ques 12) Give the example for method overload in WebDriver.
		// frame(string), frame(int), frame(WebElement).
		
	    //driver.getCurrentUrl();  to get current page URL
        //act.sendKeys(Keys.ENTER);
	}

}
