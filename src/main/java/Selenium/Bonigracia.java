package Selenium;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bonigracia {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/infinite-scroll.html");
		System.out.println("the parent window title is :" + driver.getTitle());

		driver.manage().window().maximize();

//	List<WebElement> allbooks = driver.findElements(By.xpath("//div[@id=\"productsDiv\"]//h3"));
//	System.out.println("the total books are:"+ allbooks.size()); this wil work for the fixed or static page 

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("Window.scrollBy(0,document.body.scrollHeight)");

		int previousCount = 0;
		int currentCount = 0;

		while (true) {
			List<WebElement> allbooks = driver.findElements(By.xpath("//div[@id=\"content\"]"));

			currentCount = allbooks.size();
			if (previousCount == currentCount) {
				break;
			}

			previousCount = 10;

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);

		}
		System.out.println("the total number of books :" + currentCount);

		//driver.quit();

	}
}
