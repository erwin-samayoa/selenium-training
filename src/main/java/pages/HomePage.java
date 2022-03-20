package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //private By elementCheckBoxes = By.linkText("Checkboxes");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckBoxesPage clickCheckBoxesPage() {
        clickLink("Checkboxes");
        return new CheckBoxesPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHoversPage() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
