package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindows {

    private By clickHere = By.linkText("Click Here");

    private WebDriver driver;

    public MultipleWindows(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere() {
        driver.findElement(clickHere).click();
    }
}
