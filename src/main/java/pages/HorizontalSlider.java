package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    WebDriver driver;

    By sliderElement = By.className("sliderContainer");
    By resultElement = By.id("range");

    public HorizontalSlider(WebDriver driver) {
        this.driver=driver;
    }

    /**
     *
     * @param position Is the number for the slider to be moved
     */
    public void moveSlider(float position) {
        //driver.findElement(sliderElement).findElement(By.tagName("input")).click(); //This sets the bar in the center with a value of 2.5
        driver.findElement(sliderElement).findElement(By.tagName("input")).sendKeys(" ");

        for (int i=1; i<=(int)(position*2); i++) {
            driver.findElement(sliderElement).findElement(By.tagName("input")).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult() {
        return driver.findElement(resultElement).getText();
    }

}
