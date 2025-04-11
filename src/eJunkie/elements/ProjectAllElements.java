package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectAllElements {

    public ProjectAllElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe[@class='EJIframeV3 EJOverlayV3']")
    public WebElement yourCardIframe;
    @FindBy(xpath = "//*[text()='Proceed To Pay']")
    public WebElement message;
    @FindBy(xpath = "//*[text()='Add Promo Code']")
    public WebElement promoCode;
    @FindBy(xpath = "//*[@class='Promo-Code-Value']")
    public WebElement promoCodeField;
    @FindBy(xpath = "//*[text()='Invalid promo code']")
    public WebElement invalidCode;
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@placeholder='Confirm Email']")
    public WebElement confirmEmailField;
    @FindBy(css = "button[class='Payment-Button CC']")
    public WebElement creditCardButton;
    @FindBy(xpath = "//*[@id='SnackBar']/span")
    public WebElement invalidMessage;
    @FindBy(xpath = "//button[@class='Pay-Button']")
    public WebElement payButton;
    @FindBy(xpath = "//input[@placeholder='Name On Card']")
    public WebElement nameOnCardField;
    @FindBy(xpath = "(//div[@class='basicDetails']/button)[2]")
    public WebElement demoEBookAddToCart;
    @FindBy(xpath = "//div[@class='Billing-Form Form']")
    public WebElement billingForm;
    @FindBy(xpath = "//div[@id='h-captcha-ele']/iframe")
    public WebElement humanIframe;
    @FindBy(id = "label")
    public WebElement humanField;
    @FindBy(xpath = "//img[@alt='Onay işareti']")
    public WebElement humanFieldCheck;
    @FindBy(xpath = "//div[@id='Stripe-Element']/div/iframe")
    public WebElement cardIframe;
    @FindBy(name = "cardnumber")
    public WebElement cardNumberField;
    @FindBy(name = "exp-date")
    public WebElement expDateField;
    @FindBy(name = "cvc")
    public WebElement cvcField;
    @FindBy(xpath = "//*[@id='SnackBar']/span")
    public WebElement errorText;
    @FindBy(xpath = "//p[@class='confirme_text']")
    public WebElement confirmText;
    @FindBy(xpath = "(//*[@class='price'])[2]")
    public WebElement eBookPrice;
    @FindBy(xpath = "(//span[@class='usd'])[2]")
    public WebElement lastEBookPrice;
    @FindBy(xpath = "//span[@class='download_btn top10']")
    public WebElement downloadBtn;
    @FindBy(xpath = "//*[normalize-space(text())='Contact Us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//input[@id='sender_name']")
    public WebElement nameField;
    @FindBy(xpath = "//input[@id='sender_email']")
    public WebElement emailFieldContactUs;
    @FindBy(xpath = "//input[@id='sender_subject']")
    public WebElement subjectField;
    @FindBy(xpath = "//textarea[@id='sender_message']")
    public WebElement messageField;
    @FindBy(xpath = "//button[@id='send_message_button']")
    public WebElement sendMessageButton;
    @FindBy(xpath = "//a[normalize-space()='E-commerce by E-junkie']")
    public WebElement eCommerceByEJunkieLink;
    @FindBy(xpath = "//a[@href='/']//img")
    public WebElement EJunkieLogo;
    @FindBy(xpath = "//a[@onclick='toggleYoutubeModal(true)']")
    public WebElement howItWorksButton;
    @FindBy(xpath = "//div[@class='video-container']")
    public WebElement playButton;
    @FindBy(xpath = "//button[@onclick='toggleYoutubeModal(false)']")
    public WebElement closeButton;
}
