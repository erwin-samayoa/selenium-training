package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {
    private WebDriver driver;

    By elementCheck1 = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)");
    By elementCheck2 = By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)");

    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheck1() {
        driver.findElement(elementCheck1).click();
    }

    public void clickCheck2() {
        driver.findElement(elementCheck2).click();
    }

    public boolean getCheck1Value() {
        return driver.findElement(elementCheck1).isSelected();
    }

    public boolean getCheck2Value() {
        return driver.findElement(elementCheck2).isSelected();
    }

}
