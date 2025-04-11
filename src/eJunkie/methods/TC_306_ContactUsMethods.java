package eJunkie.methods;

import eJunkie.elements.ProjectAllElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_306_ContactUsMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_306_ContactUsMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void sendMessage() {
        elements = new ProjectAllElements(driver);
        String name = "Bug Fathers";
        String email = "cigeyab754@erapk.com";
        String subject = "Test Subject";
        String message = "This is a test message.";
        String expectedUrl = "https://shopdemo.fatfreeshop.com/";
        String contactUsUrl = "https://shopdemo.fatfreeshop.com/contact";

        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL is not correct");

        action.scrollByAmount(0, 500).click(elements.contactUsButton).build().perform();

        wait.until(ExpectedConditions.urlToBe(contactUsUrl));
        Assert.assertEquals(driver.getCurrentUrl(), contactUsUrl, "URL is not correct");

        wait.until(ExpectedConditions.visibilityOf(elements.nameField)).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(elements.emailFieldContactUs)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(elements.subjectField)).sendKeys(subject);
        wait.until(ExpectedConditions.visibilityOf(elements.messageField)).sendKeys(message);
        wait.until(ExpectedConditions.elementToBeClickable(elements.sendMessageButton)).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
