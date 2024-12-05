package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBookOnScroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		System.out.println("the parent window title is :" + driver.getTitle());

		driver.manage().window().maximize();

	}

}
