package eJunkie.methods;

import eJunkie.elements.TC_302_EJunkieFaultyPaymentElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_302_EJunkieFaultyPaymentMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_302_EJunkieFaultyPaymentElements elements;

    public TC_302_EJunkieFaultyPaymentMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void faultyPaymentMethods() {
        elements = new TC_302_EJunkieFaultyPaymentElements(driver);
        String expectedUrl = "https://shopdemo.fatfreeshop.com/";
        String faultyPaymentUrl = "https://shopdemo.fatfreeshop.com/checkout";

    }
}
