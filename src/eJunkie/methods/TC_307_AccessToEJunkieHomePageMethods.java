package eJunkie.methods;

import eJunkie.elements.ProjectAllElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_307_AccessToEJunkieHomePageMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_307_AccessToEJunkieHomePageMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.wait = wait;
        this.action = action;
        this.driver = driver;
    }

    public void accessToEJunkieHomePage() {
        elements = new ProjectAllElements(driver);
        String shopDemoUrl = "https://shopdemo.fatfreeshop.com/";
        String eJunkieUrl = "https://www.e-junkie.com/";

        wait.until(ExpectedConditions.urlToBe(shopDemoUrl));
        action.scrollByAmount(0, 500).build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.eCommerceByEJunkieLink));
        elements.eCommerceByEJunkieLink.click();

        wait.until(ExpectedConditions.visibilityOf(elements.EJunkieLogo));
        elements.EJunkieLogo.click();

        wait.until(ExpectedConditions.urlToBe(eJunkieUrl));
        Assert.assertEquals(driver.getCurrentUrl(), eJunkieUrl, "URL is not correct");
    }
}
