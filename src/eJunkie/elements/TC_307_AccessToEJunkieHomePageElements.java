package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_307_AccessToEJunkieHomePageElements {

    public TC_307_AccessToEJunkieHomePageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='E-commerce by E-junkie']")
    public WebElement eCommerceByEJunkieLink;

    @FindBy(xpath = "//a[@href='/']//img")
    public WebElement EJunkieLogo;
}
