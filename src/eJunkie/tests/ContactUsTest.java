package eJunkie.tests;

import eJunkie.methods.ContactUsMethods;
import org.testng.annotations.*;
import eJunkie.base.BaseDriverParameter;

public class ContactUsTest extends BaseDriverParameter {
    @Test()
    @Parameters("BrowserType")
    public void ContactUsTest(){
        ContactUsMethods contactUsMethods = new ContactUsMethods(driver, action, wait);
        contactUsMethods.sendMessage();
    }
}
