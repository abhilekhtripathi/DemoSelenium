package com.abhi.personal;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println("the parent window title of the page is :"+ driver.getTitle());
     
		  String parent = driver.getWindowHandle();
		  //perform action 
		  WebElement inputwebelement = driver.findElement(By.xpath("//a[text()='Click Here']"));
		     inputwebelement.click();
		     Set<String> childwindows = driver.getWindowHandles();
		     for (String windowhandle : childwindows) {
		    	 if (!windowhandle.equals(parent)) {
		    		 driver.switchTo().window(windowhandle);
		    		 //perform action on child window
		    		 
		    		 System.out.println("the child window title is " +driver.getTitle());
		    		 
					
				}
				
			}
		     
		     driver.switchTo().window(parent);
		     System.out.println("Move the parent window again.........");
		     

	}

}
