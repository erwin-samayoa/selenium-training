package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.FormPage;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    //private WebDriver driver;
    private EventFiringWebDriver driver; //Deprecated
    protected HomePage homePage;
    protected FormPage formPage;

    @BeforeSuite
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new EventFiringWebDriver(new ChromeDriver()); //Deprecated
        driver.register(new EventReporter());

        //driver.get("https://formy-project.herokuapp.com/form");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

        goHome();
        setCookie();

        //driver.manage().window().maximize(); //moved to options

        homePage = new HomePage(driver);
        formPage = new FormPage(driver);

    }

    @BeforeTest
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);

    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                //de google es esta clase
                Files.move(screenshot,new File("/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Screenshot taken " + screenshot.getAbsolutePath());
        }

    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); //This is no longer supported there is another way
        options.addArguments("start-maximized");
        //options.setHeadless(true);
        return options;
    }

    private void setCookie() {
        Cookie cookie = new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
}
