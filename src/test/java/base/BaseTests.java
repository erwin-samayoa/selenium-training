package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.CheckBoxesPage;
import pages.FormPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected FormPage formPage;

    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://formy-project.herokuapp.com/form");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

        goHome();

        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        formPage = new FormPage(driver);

    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
