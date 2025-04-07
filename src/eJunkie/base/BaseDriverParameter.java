package eJunkie.base;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public Actions action;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserType")
    public void Setup(String browserType){
        CloseFaultyWindows();
        CloseFaultyForMac();

        switch (browserType.toLowerCase()) {
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://shopdemo.fatfreeshop.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        action = new Actions(driver);
    }

    @AfterClass
    public void TearDown() {
        MyFunc.Sleep(5);
        driver.quit();
    }

    public void CloseFaultyForMac() {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "pgrep -P $(pgrep chromedriver) | xargs kill -9"});
            process.waitFor();
            process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "pgrep chromedriver | xargs kill -9"});
            process.waitFor();
        } catch (Exception ignored) {
        }
    }

    public void CloseFaultyWindows() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {
        }
    }
}
