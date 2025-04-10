package eJunkie.methods;

import eJunkie.elements.TC_303_FailedPaymentCheckElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_303_FailedPaymentCheckMethods {

    WebDriver driver;
    WebDriverWait wait;
    TC_303_FailedPaymentCheckElements elements;

    public TC_303_FailedPaymentCheckMethods(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void failedPaymentCheck() {
        elements = new TC_303_FailedPaymentCheckElements(driver);

        String name = " Bruce Wayne";
        String email = "ejunkieshop@gmail.com";
        String creditCardNum = "1111111111111111";
        String expirationDate = "1111";
        String cvc = "111";

        elements.demoEBook.click();

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
    }
}
