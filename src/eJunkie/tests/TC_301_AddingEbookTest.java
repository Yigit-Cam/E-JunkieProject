package eJunkie.tests;

import eJunkie.base.BaseDriverParameter;
import eJunkie.methods.TC_301_AddingEbookMethods;
import org.testng.annotations.*;

public class TC_301_AddingEbookTest extends BaseDriverParameter {

    @Test()
    @Parameters("BrowserType")
    public void AddingEbookTest(){
        TC_301_AddingEbookMethods methods=new TC_301_AddingEbookMethods(driver,action,wait);
        methods.addEbook();
    }
}
