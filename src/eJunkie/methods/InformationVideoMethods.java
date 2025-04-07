package eJunkie.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationVideoMethods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    InformationVideoMethods informationVideoMethods;

    public InformationVideoMethods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
    }

    public void playVideo() {
        informationVideoMethods = new InformationVideoMethods(driver, action, wait);
    }
}
