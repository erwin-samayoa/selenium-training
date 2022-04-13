package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testUntilWaitHidden() {
        var loadingPage = homePage.clickDynamicLoadingPage();
        var example1 = loadingPage.clickExample1();
        example1.clickStartButton();
        assertEquals(example1.getLoadedText(),"Hello World!","Error en hello world");
    }
}
