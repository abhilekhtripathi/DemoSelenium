package com.abhi.personal;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SceenshotTest {
	public static void main(String[] args) throws IOException {
		WebDriver  driver = new ChromeDriver();
		driver.get("");
		System.out.println("the parent window title is :" + driver.getTitle());
		       //perform the action on the parent window
		   TakesScreenshot screenshot = (TakesScreenshot) driver;
		    File source = screenshot.getScreenshotAs(OutputType.FILE);
		    File destionation = new File("the failed element iamge path/.png");
		    
		    FileHandler.copy(source, destionation);
		    System.out.println("the screenshot has taken :" +destionation.getAbsolutePath());
	}

}
