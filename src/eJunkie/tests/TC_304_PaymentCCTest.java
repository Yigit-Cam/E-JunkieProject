package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_304_PaymentCCMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_304_PaymentCCTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void PaymentTest() {
        TC_304_PaymentCCMethods methods = new TC_304_PaymentCCMethods(driver, action, wait);
        methods.payment();
    }
}
