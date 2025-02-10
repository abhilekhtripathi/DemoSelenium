package Selenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksBestExample {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.brokenlinkcheck.com/");

        // Collect all links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<String> brokenLinks = new ArrayList<>();

        // Check each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("Empty URL for link text: " + link.getText());
                continue;
            }
            if (url.startsWith("mailto:") || url.startsWith("tel:")) {
                continue; // Skip non-HTTP links
            }
            
            int responseCode = getResponseCode(url);
            if (responseCode >= 400) {
                brokenLinks.add(url + " (Status Code: " + responseCode + ")");
            }
        }

        driver.quit(); // Close the browser

        // Print broken links
        System.out.println("Broken Links Found:");
        brokenLinks.forEach(System.out::println);
    }

    // Helper method to get HTTP response code
    private static int getResponseCode(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();
            return connection.getResponseCode();
        } catch (IOException e) {
            return -1; // Indicates connection failure (e.g., timeout)
        }
    }
}