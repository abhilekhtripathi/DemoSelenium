package methodoverloadingVSmthodoverriding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {

    private By proceedToCheckout = By.id("hlb-ptc-btn-native");
    private By paymentOption = By.id("payment-option");
    private By placeOrderButton = By.id("place-order-button");

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void makePayment() {
        driver.get("https://www.amazon.com/cart");
        System.out.println("Opening Amazon cart page.and perform the payemntCash");
    }

    public void makePaymentByCheck() {
        driver.findElement(proceedToCheckout).click();
        driver.findElement(paymentOption).click();
        driver.findElement(placeOrderButton).click();
    }
}
