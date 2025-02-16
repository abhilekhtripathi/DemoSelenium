package methodoverloadingVSmthodoverriding;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void makePayment() {
        driver.get("https://www.amazon.com");
        System.out.println("Opening Amazon home page.and Process the payament");
    }
}
