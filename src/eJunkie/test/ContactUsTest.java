package eJunkie.test;

import org.testng.annotations.*;
import eJunkie.base.BaseDriverParameter;

public class ContactUsTest extends BaseDriverParameter {
    @Test()
    @Parameters("BrowserType")
    public void ContactUsTest(){
        System.out.println("Contact Us Test");

    }
}
