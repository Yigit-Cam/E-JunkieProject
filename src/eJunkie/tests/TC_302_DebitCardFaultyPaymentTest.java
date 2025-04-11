package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_302_DebitCardFaultyPaymentMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_302_DebitCardFaultyPaymentTest extends BaseDriverParameter {

    @Test
    @Parameters("BrowserType")
    public void faultyPaymentTest(){
        TC_302_DebitCardFaultyPaymentMethods methods = new TC_302_DebitCardFaultyPaymentMethods(driver, action, wait);
        methods.faultyPayment();
    }
}
