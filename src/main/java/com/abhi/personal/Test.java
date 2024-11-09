package com.abhi.personal;

import java.io.File;
import java.time.Duration;
import java.util.Set;
import java.util.logging.FileHandler;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		System.out.println("the ttilte os the page is :" + driver.getTitle());

		WebElement iframe = driver.findElement(By.xpath("testing"));

		driver.switchTo().frame(iframe);
		// perform the action in the frame if want to do that

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
		driver.findElement(By.xpath("new text")).sendKeys("test");
	}
}
