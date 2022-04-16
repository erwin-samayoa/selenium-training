package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {
    private WebDriver driver;

    private By textBlock = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    private int getNumberOfScrollPharagraphsPresent() {
        return driver.findElements(textBlock).size();
    }


    /**
     *
     * @param index starts in 1
     */
    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while (getNumberOfScrollPharagraphsPresent() < index) {
            jsExecutor.executeScript(script);
        }
    }
}
