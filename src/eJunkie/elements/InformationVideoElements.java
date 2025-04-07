package eJunkie.elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationVideoElements {

    public InformationVideoElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='EJ-ShopLink']")
    public WebElement eCommerceButton;

    @FindBy(xpath = "//a[@onclick='toggleYoutubeModal(true)']")
    public WebElement howItWorksButton;

    @FindBy(xpath = "//div[@class='video-container']")
    public WebElement playButton;

    @FindBy(xpath = "//button[@onclick='toggleYoutubeModal(false)']")
    public WebElement closeButton;
}
