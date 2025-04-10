package eJunkie.methods;

import Utility.MyFunc;
import eJunkie.elements.TC_305_PaymentProcessApprovalDownloadElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_305_PaymentProcessApprovalDownloadMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_305_PaymentProcessApprovalDownloadElements elements;

    public TC_305_PaymentProcessApprovalDownloadMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void payment() {
        elements = new TC_305_PaymentProcessApprovalDownloadElements(driver);
        String name = "RFT TEST";
        String email = "rfttest123@test.com";
        String creditCardNum = "4242424242424242";
        String expirationDate = "1225";
        String CVC = "000";

        wait.until(ExpectedConditions.visibilityOf(elements.eBookPrice));
        String expectedBookPrice = elements.eBookPrice.getText().replaceAll("[^0-9.,]", "");
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

        String eBookPrice = elements.lastEBookPrice.getText().replaceAll("[^0-9.,]", "");
        Assert.assertEquals(eBookPrice,expectedBookPrice,"The first price and the last price are different.");

        elements.downloadBtn.click();
    }
}
