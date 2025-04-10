package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_305_PaymentProcessApprovalDownloadMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_305_PaymentProcessApprovalDownloadTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void PaymentTest() {
        TC_305_PaymentProcessApprovalDownloadMethods methods = new TC_305_PaymentProcessApprovalDownloadMethods(driver, action, wait);
        methods.payment();
    }
}
