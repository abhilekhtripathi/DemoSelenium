package com.abhi.personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOvering {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		System.out.println("the parent window title is :" + driver.getTitle());

		WebElement rightclick = driver.findElement(By.xpath(null));

		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
	}

}
