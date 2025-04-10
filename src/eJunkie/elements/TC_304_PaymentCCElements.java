package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class TC_304_PaymentCCElements {

    public TC_304_PaymentCCElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='basicDetails']/button)[2]")
    public WebElement demoEbook;

    @FindBy(xpath = "//iframe[@class='EJIframeV3 EJOverlayV3']")
    public WebElement yourCardIframe;

    @FindBy(css = "button[class='Payment-Button CC']")
    public WebElement creditCardButton;

    @FindBy(xpath = "//div[@class='Billing-Form Form']")
    public WebElement billingForm;

    @FindBy(xpath = "//div[@id='h-captcha-ele']/iframe")
    public WebElement humanIframe;

    @FindBy(id = "label")
    public WebElement humanField;

    @FindBy(xpath = "//div[@class='check']/img")
    public WebElement humanFieldCheck;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Confirm Email']")
    public WebElement confirmEmailField;

    @FindBy(xpath = "//input[@placeholder='Name On Card']")
    public WebElement nameOnCardField;

    @FindBy(xpath = "//div[@id='Stripe-Element']/div/iframe")
    public WebElement cardIframe;

    @FindBy(name = "cardnumber")
    public WebElement cardNumberField;

    @FindBy(name = "exp-date")
    public WebElement expDateField;

    @FindBy(name = "cvc")
    public WebElement cvcField;

    @FindBy(xpath = "//button[@class='Pay-Button']")
    public WebElement payButton;

    @FindBy(xpath = "//p[@class='confirme_text']")
    public WebElement confirmText;
}
