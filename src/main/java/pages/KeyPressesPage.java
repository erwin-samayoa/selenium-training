package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;

    By textElement = By.id("target");
    By resultElement = By.id("result");

    KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendText(String text) {
        driver.findElement(textElement).sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(resultElement).getText();
    }

    public void enterPi() {
        sendText(Keys.chord(Keys.ALT,"2","2","7") + "=3.14"); //No lo cacha bien
    }
}
