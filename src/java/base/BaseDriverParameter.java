package java.base;
import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserTipi")
    public void Setup(String browserTipi) {
        switch (browserTipi.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterClass
    public void TearDown() {
        MyFunc.Sleep(3);
        driver.quit();
    }

    public static void CloseFaultyForMac() {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "pgrep -P $(pgrep chromedriver) | xargs kill -9"});
            process.waitFor();
            process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "pgrep chromedriver | xargs kill -9"});
            process.waitFor();
        } catch (Exception ignored) {
        }
    }
}
