package eJunkie.methods;

import eJunkie.elements.ProjectAllElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_304_PaymentCCMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_304_PaymentCCMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void payment() {
        elements = new ProjectAllElements(driver);
        String name = "RFT TEST";
        String email = "rfttest123@test.com";
        String creditCardNum = "4242424242424242";
        String expirationDate = "1225";
        String cvc = "000";

        wait.until(ExpectedConditions.visibilityOf(elements.demoEBookAddToCart));
        elements.demoEBookAddToCart.click();

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
        elements.cardNumberField.sendKeys(creditCardNum);
        elements.expDateField.sendKeys(expirationDate);
        elements.cvcField.sendKeys(cvc);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(elements.yourCardIframe);
        elements.payButton.click();

        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(elements.confirmText));
        Assert.assertEquals(elements.confirmText.getText(), "RFT, your order is confirmed. Thank you!");
    }
}
