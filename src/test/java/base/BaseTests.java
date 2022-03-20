package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CheckBoxesPage;
import pages.FormPage;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected FormPage formPage;

    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://formy-project.herokuapp.com/form");
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        formPage = new FormPage(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
