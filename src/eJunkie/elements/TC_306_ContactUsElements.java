package eJunkie.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_306_ContactUsElements {

    public TC_306_ContactUsElements(WebDriver driver) {
        PageFactory .initElements(driver, this);
    }

    @FindBy(xpath = "//*[normalize-space(text())='Contact Us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//input[@id='sender_name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id='sender_email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='sender_subject']")
    public WebElement subjectInput;

    @FindBy(xpath = "//textarea[@id='sender_message']")
    public WebElement messageInput;

    @FindBy(xpath = "//button[@id='send_message_button']")
    public WebElement sendMessageButton;
}
