package com.abhi.personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("");
     System.out.println("The page titile is :" +driver.getTitle());
     
     WebElement dropdownfield = driver.findElement(By.xpath("dropdownloan"));
     
     Select sel = new Select(dropdownfield);
     sel.selectByIndex(2);
     sel.selectByVisibleText("test");

}
}