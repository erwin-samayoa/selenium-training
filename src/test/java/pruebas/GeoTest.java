package pruebas;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.HomePage;
import utils.EventReporter;

import java.util.HashMap;
import java.util.Map;

public class GeoTest {

    @Test
    public void testGeoChange() {
        ChromeDriver driver; //Needs ChromeDriver type instead WebDriver
        //Quick test for geo location changing trough devtools
        //Requires maven dependency

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        Map coordinates = Map.of("latitude",51.508505, "longitude",-0.127224, "accuracy",10 ); //Couldn't make it with variable pre assigned

        driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);

        driver.get("https://my-location.org/");


    }
}
