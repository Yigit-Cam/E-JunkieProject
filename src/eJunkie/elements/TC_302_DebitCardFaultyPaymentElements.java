package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_302_DebitCardFaultyPaymentElements {

    public TC_302_DebitCardFaultyPaymentElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[text()=' Add To Cart'])[2]")
    public WebElement eBook;

    @FindBy(xpath = "//iframe[@class='EJIframeV3 EJOverlayV3']")
    public WebElement yourCardIframe;

    @FindBy(xpath = "//*[text()='Proceed To Pay']")
    public WebElement meesage;

    @FindBy(xpath = "//*[text()='Add Promo Code']")
    public WebElement promoCode;

    @FindBy(xpath = "//*[@class='Promo-Code-Value']")
    public WebElement promoCodeField;

    @FindBy(xpath = "//*[text()='Invalid promo code']")
    public WebElement invalidCode;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='billing_name']")
    public WebElement billingNameField;

    @FindBy(xpath = "//button[text()='Pay']")
    public WebElement payButton;
}
