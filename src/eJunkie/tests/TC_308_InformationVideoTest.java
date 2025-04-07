package eJunkie.tests;
import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.InformationVideoMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_308_InformationVideoTest extends BaseDriverParameter {
    @Test
    @Parameters("BrowserType")
    public void InformationVideoTest() {
        InformationVideoMethods informationVideoMethods= new InformationVideoMethods(driver,action,wait);
        informationVideoMethods.playVideo();
    }
}
