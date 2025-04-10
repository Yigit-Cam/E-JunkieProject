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
        String shopDemoUrl = "https://shopdemo.fatfreeshop.com/";
        String eJunkieUrl = "https://www.e-junkie.com/";

        wait.until(ExpectedConditions.urlToBe(shopDemoUrl));

        action.click(informationVideoElements.eCommerceButton).perform();

        driver.navigate().refresh();

        wait.until(ExpectedConditions.urlContains(eJunkieUrl));
        Assert.assertTrue(driver.getCurrentUrl().contains(eJunkieUrl), "URL does not contain eJunkie URL");

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.howItWorksButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.playButton)).click();
        MyFunc.Sleep(11); // Sleep for 11 seconds to allow the video to play

        wait.until(ExpectedConditions.visibilityOf(informationVideoElements.closeButton)).click();
    }
}
