package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By elementCheckBoxes = By.linkText("Checkboxes");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckBoxesPage clickCheckBoxesPage() {
        driver.findElement(elementCheckBoxes).click();
        return new CheckBoxesPage(driver);
    }
}
