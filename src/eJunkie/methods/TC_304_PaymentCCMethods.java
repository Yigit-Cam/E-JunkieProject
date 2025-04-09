package eJunkie.methods;

import eJunkie.elements.TC_304_PaymentCCElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_304_PaymentCCMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_304_PaymentCCElements elements;

    public TC_304_PaymentCCMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void payment() {
        elements = new TC_304_PaymentCCElements(driver);
        String name = "RFT TEST";
        String email = "rfttest123@test.com";
        String creditCardNum = "4242424242424242";
        String expirationDate = "1225";
        String CVC = "000";

        elements.demoeBook.click();

        driver.switchTo().frame(elements.yourCardIframe);

        elements.creditCardButton.click();
        wait.until(ExpectedConditions.visibilityOf(elements.billingForm));
        driver.switchTo().frame(elements.humanIframe);
        elements.humanField.click();
        wait.until(ExpectedConditions.visibilityOf(elements.humanFieldCheck));

        driver.switchTo().defaultContent();
        driver.switchTo().frame(elements.yourCardIframe);
        elements.emailField.sendKeys(email);
        elements.confirmEmailField.sendKeys(email);
        elements.nameOnCardField.sendKeys(name);

        driver.switchTo().frame(elements.cardIframe);
        elements.cardnumberField.sendKeys(creditCardNum);
        elements.expDateField.sendKeys(expirationDate);
        elements.cvcField.sendKeys(CVC);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(elements.yourCardIframe);
        elements.payButton.click();

        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(elements.confirmeText));
        Assert.assertEquals(elements.confirmeText.getText(), "RFT, your order is confirmed. Thank you!");
    }
}
