package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ThanksPage {
    private WebDriver driver;

    private By elementResultBox = By.cssSelector("body > div > div");

    public void waitForElement(By element) {
        Boolean loop=true;
        while (loop) {
            if(driver.findElements(element).size() > 0) {
                loop=false;
            } else {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    ThanksPage(WebDriver driver) {
        this.driver = driver;
        System.out.println(driver.findElements(elementResultBox).size());
    }

    public String getResultText() {
        waitForElement(elementResultBox);
        System.out.println(driver.findElements(elementResultBox).size());
        return driver.findElement(elementResultBox).getText();
    }
}
