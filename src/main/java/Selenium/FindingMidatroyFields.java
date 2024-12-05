package Selenium;

import java.lang.annotation.ElementType;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingMidatroyFields {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		System.out.println("the parent window title is :" + driver.getTitle());

		driver.manage().window().maximize();
		List<WebElement> lables = driver.findElements(By.xpath("//form[@id='form-register']//label"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for (WebElement webElement : lables) {
			System.out.println(webElement.getText());
			String str = "return window.getComputedStyle(arguments[0],'::Before').getPropertyValue('conyent');";
			String content =js.executeScript(str, webElement).toString();
			
			System.out.println(content);
			
		}
		driver.quit();
		
		
	}

}
