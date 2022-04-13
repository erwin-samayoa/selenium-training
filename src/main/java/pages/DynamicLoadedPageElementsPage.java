package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadedPageElementsPage {
    private WebDriver driver;
    private String linkXpathFormat = ".//a[contains(text(),'%s')]";
    private By linkExample1 = By.xpath(String.format(linkXpathFormat,"Example 1:"));

    public DynamicLoadedPageElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1 clickExample1() {
        driver.findElement(linkExample1).click();
        return new Example1(driver);
    }

}
