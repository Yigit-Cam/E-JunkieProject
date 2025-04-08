package eJunkie.methods;

import eJunkie.elements.TC_306_ContactUsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_306_ContactUsMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_306_ContactUsElements elements;

    public TC_306_ContactUsMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void sendMessage(){
        elements = new TC_306_ContactUsElements(driver);
        String name = "Bug Fathers";
        String email = "cigeyab754@erapk.com";
        String subject = "Test Subject";
        String message = "This is a test message.";

        wait.until(ExpectedConditions.urlToBe("https://shopdemo.fatfreeshop.com/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://shopdemo.fatfreeshop.com/"), "URL is not correct");

        action.scrollByAmount(0, 500)
                .click(elements.contactUsButton)
                .build()
                .perform();

        wait.until(ExpectedConditions.urlToBe("https://shopdemo.fatfreeshop.com/contact"));
        Assert.assertTrue( driver.getCurrentUrl().contains("https://shopdemo.fatfreeshop.com/contact"), "URL is not correct");

        wait.until(ExpectedConditions.visibilityOf(elements.nameInput)).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(elements.emailInput)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(elements.subjectInput)).sendKeys(subject);
        wait.until(ExpectedConditions.visibilityOf(elements.messageInput)).sendKeys(message);
        wait.until(ExpectedConditions.elementToBeClickable(elements.sendMessageButton)).click();

        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Alert text: " + alertText);
        driver.switchTo().alert().accept();
    }
}
