package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_303_FailedPaymentCheckMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_303_FailedPaymentCheckTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void FailedPaymentCheck() {
        TC_303_FailedPaymentCheckMethods methods = new TC_303_FailedPaymentCheckMethods(driver, wait);
        methods.failedPaymentCheck();
    }
}
