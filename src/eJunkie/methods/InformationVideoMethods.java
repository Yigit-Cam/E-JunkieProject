package eJunkie.methods;
import Utility.MyFunc;
import eJunkie.elements.InformationVideoElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InformationVideoMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    InformationVideoElements informationVideoElements;

    public InformationVideoMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void playVideo() {
        informationVideoElements = new InformationVideoElements(driver);

        wait.until(ExpectedConditions.urlToBe("https://shopdemo.fatfreeshop.com/"));

        action.click(informationVideoElements.eCommerceButton).perform();

        MyFunc.Sleep(2);

        driver.navigate().refresh();

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.howItWorksButton));

        action.click(informationVideoElements.howItWorksButton).perform();

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.playButton)).click();

        MyFunc.Sleep(11);

        wait.until(ExpectedConditions.elementToBeClickable(informationVideoElements.closeButton)).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.e-junkie.com/"), "URL is not correct");
    }
}
