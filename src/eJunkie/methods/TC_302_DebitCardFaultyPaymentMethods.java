package eJunkie.methods;

import eJunkie.elements.ProjectAllElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_302_DebitCardFaultyPaymentMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_302_DebitCardFaultyPaymentMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void faultyPayment() {
        elements = new ProjectAllElements(driver);

        elements.demoEBookAddToCart.click();

        driver.switchTo().frame(elements.yourCardIframe);

        Assert.assertTrue(elements.message.isDisplayed(), "Proceed to Pay button not visible");
        elements.creditCardButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.emailField)).clear();
        elements.nameOnCardField.clear();
        elements.confirmEmailField.clear();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(elements.yourCardIframe);

        wait.until(ExpectedConditions.visibilityOf(elements.payButton)).click();

        wait.until(ExpectedConditions.visibilityOf(elements.invalidMessage));

        Assert.assertTrue(elements.invalidMessage.isDisplayed(), "Invalid message not displayed");
    }
}
