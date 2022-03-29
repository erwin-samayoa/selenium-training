package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadField = By.id("file-submit");
    private By uploadedFilesElement = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadField).click();
    }

    /**
     *
      * @param file path absoluto
     */
    public void uploadFile(String file) {
        driver.findElement(inputField).sendKeys(file);
        clickUploadButton();
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadedFilesElement).getText();
    }
}
