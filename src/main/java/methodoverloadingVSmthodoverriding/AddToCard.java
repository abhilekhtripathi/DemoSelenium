package methodoverloadingVSmthodoverriding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCard extends BasePage {

    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");
    private By productLink = By.xpath("//span[contains(text(),'Echo Dot')]");
    private By addToCartButton = By.id("add-to-cart-button");

    public AddToCard(WebDriver driver) {
        super(driver);
    }

    // Basic method to add a product to cart
    public void addToCartItem(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
        driver.findElement(productLink).click();
        driver.findElement(addToCartButton).click();
    }

    // Overloaded method with a confirmation message
    public void addToCartItem(String productName, String confirmationMessage) {
        addToCartItem(productName);
        System.out.println(confirmationMessage);
    }
}
