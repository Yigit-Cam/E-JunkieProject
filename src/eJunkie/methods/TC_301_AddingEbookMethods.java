package eJunkie.methods;

import eJunkie.elements.TC_301_AddingEbookElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_301_AddingEbookMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_301_AddingEbookElements elements;

    public TC_301_AddingEbookMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void addEbook() {
        elements = new TC_301_AddingEbookElements(driver);
        String code = "1234b";

        elements.eBook.click();

        driver.switchTo().frame(elements.yourCardIframe);
        Assert.assertTrue(elements.message.isDisplayed(), "No visible");
        elements.promoCode.click();

        elements.promoCodeField.sendKeys(code + Keys.ENTER);
        Assert.assertTrue(elements.invalidCode.isDisplayed(), "No visible");
    }
}
