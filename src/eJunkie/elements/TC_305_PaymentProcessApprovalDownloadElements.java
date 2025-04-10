package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_305_PaymentProcessApprovalDownloadElements {
    public TC_305_PaymentProcessApprovalDownloadElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='price'])[2]")
    public WebElement eBookPrice;

    @FindBy(xpath = "(//div[@class='basicDetails']/button)[2]")
    public WebElement demoeBook;

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

    @FindBy(xpath = "//img[@alt='Onay işareti']")
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
    public WebElement cardnumberField;

    @FindBy(name = "exp-date")
    public WebElement expDateField;

    @FindBy(name = "cvc")
    public WebElement cvcField;

    @FindBy(xpath = "//button[@class='Pay-Button']")
    public WebElement payButton;

    @FindBy(xpath = "//p[@class='confirme_text']")
    public WebElement confirmeText;

    @FindBy(xpath = "(//span[@class='usd'])[2]")
    public WebElement lastEBookPrice;

    @FindBy(xpath = "//span[@class='download_btn top10']")
    public WebElement downloadBtn;
}
