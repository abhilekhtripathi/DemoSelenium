package com.abhi.personal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandle {
	public static void main(String[] args) {
		
   WebDriver driver = new ChromeDriver();
     driver.get("");
     System.out.println("the title of the page is:" + driver.getTitle());
     
    WebElement iframeEle = driver.findElement(By.xpath("test"));
      driver.switchTo().frame(iframeEle);
      
      
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebDriver iframe = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("id")));
      
       
	}
}
