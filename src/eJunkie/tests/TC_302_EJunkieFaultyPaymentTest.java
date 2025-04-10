package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_302_EJunkieFaultyPaymentMethods;
import org.testng.annotations.*;

public class TC_302_EJunkieFaultyPaymentTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void EJunkieFaultyPaymentTest() {
        TC_302_EJunkieFaultyPaymentMethods methods = new TC_302_EJunkieFaultyPaymentMethods(driver, action, wait);
        methods.faultyPaymentMethods();
    }
}
