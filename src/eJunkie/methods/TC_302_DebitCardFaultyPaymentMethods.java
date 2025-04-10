package eJunkie.methods;

import eJunkie.elements.TC_302_DebitCardFaultyPaymentElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_302_DebitCardFaultyPaymentMethods {

    WebDriver driver;
    Actions actionn;
    WebDriverWait wait;
    TC_302_DebitCardFaultyPaymentElements elements;

    public TC_302_DebitCardFaultyPaymentMethods(WebDriver driver, Actions actionn, WebDriverWait wait) {
        this.driver = driver;
        this.actionn = actionn;
        this.wait = wait;
    }

    public void faultyPayment() {
        elements = new TC_302_DebitCardFaultyPaymentElements(driver);
        //String expectedUrl = "https://shopdemo.fatfreeshop.com/";
        //String faultyPaymentUrl = "https://shopdemo.fatfreeshop.com/checkout";

        elements.eBook.click();


        driver.switchTo().frame(elements.yourCardIframe);


        Assert.assertTrue(elements.meesage.isDisplayed(), "Proceed to Pay button not visible");


        elements.emailField.clear();
        elements.billingNameField.clear();
        elements.promoCodeField.clear();


        elements.payButton.click();


        Assert.assertTrue(driver.getPageSource().contains("Invalid email"), "Invalid email message not displayed");
        Assert.assertTrue(driver.getPageSource().contains("Invalid Billing Name"), "Invalid Billing Name message not displayed");
    }
}
