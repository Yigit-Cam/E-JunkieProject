package eJunkie.methods;

import Utility.MyFunc;
import eJunkie.elements.ProjectAllElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC_308_InformationVideoMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_308_InformationVideoMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void playVideo() {
        elements = new ProjectAllElements(driver);
        String shopDemoUrl = "https://shopdemo.fatfreeshop.com/";
        String eJunkieUrl = "https://www.e-junkie.com/";

        wait.until(ExpectedConditions.urlToBe(shopDemoUrl));

        action.click(elements.eCommerceByEJunkieLink).perform();

        driver.navigate().refresh();

        wait.until(ExpectedConditions.urlContains(eJunkieUrl));
        Assert.assertTrue(driver.getCurrentUrl().contains(eJunkieUrl), "URL does not contain eJunkie URL");

        wait.until(ExpectedConditions.elementToBeClickable(elements.howItWorksButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.playButton)).click();
        MyFunc.Sleep(11); // Sleep for 11 seconds to allow the video to play

        wait.until(ExpectedConditions.visibilityOf(elements.closeButton)).click();
    }
}
