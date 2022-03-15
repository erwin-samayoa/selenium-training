package checkboxes;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

import static org.testng.Assert.*;

public class CheckBoxTest extends BaseTests {
    @Test
    public void testCheckBoxes() {
        CheckBoxesPage checkBoxesPage = homePage.clickCheckBoxesPage();
        checkBoxesPage.clickCheck1(); //Set
        checkBoxesPage.clickCheck2(); //Unset
        assertTrue(checkBoxesPage.getCheck1Value(),"Check 1 No OK");
        assertFalse(checkBoxesPage.getCheck2Value(),"Check 2 No OK");
    }
}
