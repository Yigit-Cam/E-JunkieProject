package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TC_302_EJunkieFaultyPaymentElements {

    public TC_302_EJunkieFaultyPaymentElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
