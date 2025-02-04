package Selenium;

public class Selenium3vsSelenium4 {

	public static void main(String[] args) 
	{
		//  Selenium 4
		/**
		 * Selenium 4 uses W3C standard protocol	
		 * Selenium Grid  -   New UI, Standalone mode, Docker support, and auto session reconnect
		 * Window/Tab Handling-- driver.new_window("window") or driver.new_window("tab") simplifies handling
		 * Relative Locators  - Introduces above(), below(), to_left_of(), to_right_of(), near()
		 * Screenshots	-  Supports element-specific screenshots and full-page screenshots
		 * ✔ Better performance & stability (W3C WebDriver Protocol)
           ✔ Easier Grid setup with Docker & session management
           ✔ Simplified multi-window handling
           ✔ New Relative Locators for better element identification
           ✔ Advanced debugging with CDP
           ✔ Improved screenshots & Actions API
		 * 
		 * ____________________________________________________________________________
		 * Selenium 3
		 * 
		 * Selenium 3 used JSON wire protocol
		 * Chrome Driver class extended Remote webdriver class
		 * No Support for docker
		 * Selenium IDE just available as a firefox add-on
		 * Testers always had to start Hub and Node jars which was a difficult task in selenium 3.
		 * 
		 * 
		 * 
		 */

	}

}
