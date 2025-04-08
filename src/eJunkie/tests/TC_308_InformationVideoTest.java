package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_308_InformationVideoMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_308_InformationVideoTest extends BaseDriverParameter {
    @Test
    @Parameters("BrowserType")
    public void InformationVideoTest() {
        TC_308_InformationVideoMethods informationVideoMethods = new TC_308_InformationVideoMethods(driver, action, wait);
        informationVideoMethods.playVideo();
    }
}
