package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver driver;

    //Variables by id are in wrapper method locateFieldById
    private By elementSubmitButton = By.linkText("Submit");

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public By locateFieldById(String id) {
        return By.id(id);
    }

    public void setFirstName(String firstName) {
        driver.findElement(locateFieldById("first-name")).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(locateFieldById("last-name")).sendKeys(lastName);
    }

    public void setJobTitle(String jobTitle) {
        driver.findElement(locateFieldById("job-title")).sendKeys(jobTitle);
    }

    public void setEducationLevel(Integer option) {
        switch (option) {
            case 1:
                driver.findElement(locateFieldById("radio-button-1")).click();
                break;
            case 2:
                driver.findElement(locateFieldById("radio-button-2")).click();
                break;
            case 3:
                driver.findElement(locateFieldById("radio-button-3")).click();
                break;
        }

    }

    public void setSex(Integer option) {
        driver.findElement(locateFieldById("checkbox-" + option)).click();
    }

    public void setYearsOfExperience(Integer option) {
        driver.findElement(locateFieldById("select-menu")).click();
        switch (option) {
            case 1:
                driver.findElement(By.cssSelector("#select-menu > option:nth-child(1)")).click();
                break;
            case 2:
                driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
                break;
            case 3:
                driver.findElement(By.cssSelector("#select-menu > option:nth-child(3)")).click();
                break;
            case 4:
                driver.findElement(By.cssSelector("#select-menu > option:nth-child(4)")).click();
                break;
            case 5:
                driver.findElement(By.cssSelector("#select-menu > option:nth-child(5)")).click();
                break;
        }
    }

    public void setDate(String date) {
        driver.findElement(locateFieldById("datepicker")).sendKeys(date);
    }

    public ThanksPage clickSubmitButton() {
        driver.findElement(elementSubmitButton).click();
        return new ThanksPage(driver);
    }

}
