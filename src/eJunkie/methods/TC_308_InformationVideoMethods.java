package eJunkie.methods;

import Utility.MyFunc;
import eJunkie.elements.TC_308_InformationVideoElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_308_InformationVideoMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    TC_308_InformationVideoElements informationVideoElements;

    public TC_308_InformationVideoMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void playVideo() {
        informationVideoElements = new TC_308_InformationVideoElements(driver);

        wait.until(ExpectedConditions.urlToBe("https://shopdemo.fatfreeshop.com/"));

        action.click(informationVideoElements.eCommerceButton).perform();

        driver.navigate().refresh();

        wait.until(ExpectedConditions.urlContains("https://www.e-junkie.com/"));

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.e-junkie.com/"), "URL is not correct");

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.howItWorksButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.playButton)).click();

        MyFunc.Sleep(11);

        wait.until(ExpectedConditions.visibilityOf(informationVideoElements.closeButton)).click();
    }
}
