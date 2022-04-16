package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTests {
    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickinfiniteScrollPage().scrollToParagraph(5);
    }
}
