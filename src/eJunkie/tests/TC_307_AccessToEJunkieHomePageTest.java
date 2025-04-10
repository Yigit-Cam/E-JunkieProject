package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_307_AccessToEJunkieHomePageMethods;
import org.testng.annotations.*;

public class TC_307_AccessToEJunkieHomePageTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void AccessToEJunkieHomePageTest() {
        TC_307_AccessToEJunkieHomePageMethods methods = new TC_307_AccessToEJunkieHomePageMethods(driver, action, wait);
        methods.accessToEJunkieHomePage();
    }
}
