package eJunkie.tests;

import eJunkie.methods.TC_306_ContactUsMethods;
import org.testng.annotations.*;
import eJunkie.base.BaseDriverParameter;

public class TC_306_ContactUsTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void ContactUsTest() {
        TC_306_ContactUsMethods methods = new TC_306_ContactUsMethods(driver, action, wait);
        methods.sendMessage();
    }
}
