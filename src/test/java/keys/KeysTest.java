package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;


public class KeysTest extends BaseTests {
    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPressesPage();
        keyPage.sendText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE","Wrong result");
    }

    @Test
    public void testPi() {
        var keyPage = homePage.clickKeyPressesPage();
        keyPage.enterPi();
    }

    @Test
    public void testSlider() {
        HorizontalSlider horizontalSliderPage =  homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSlider((float)3.5);
        assertEquals(horizontalSliderPage.getResult(),"3.5","Error in result");
    }
}
