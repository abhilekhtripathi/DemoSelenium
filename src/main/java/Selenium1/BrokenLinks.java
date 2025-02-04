package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        try {
            String url = "https://www.brokenlinkcheck.com/"; // Change this to your target website
            driver.get(url);

            // Find all links on the webpage
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total links found: " + links.size());

            // Check each link
            for (WebElement link : links) {
                String href = link.getAttribute("href");
                if (href != null && !href.isEmpty()) {
                    checkBrokenLink(href);
                }
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Function to check if a link is broken
    public static void checkBrokenLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            
            int statusCode = connection.getResponseCode();
            if (statusCode >= 400) {
                System.out.println("❌ Broken Link: " + linkUrl + " - Status Code: " + statusCode);
            } else {
                System.out.println("✅ Valid Link: " + linkUrl + " - Status Code: " + statusCode);
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error checking link: " + linkUrl);
        }
    }
}
