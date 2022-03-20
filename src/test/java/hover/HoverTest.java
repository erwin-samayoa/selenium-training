package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTests {
    @Test
    public void testHoverUser1() {
        var hoverPage = homePage.clickHoversPage();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Message is not displayed");
        assertEquals(caption.getTitle(),"name: user1","Incorrect caption title");
        assertEquals(caption.getLinkText(),"View profile","Incorrect link text");
        assertTrue(caption.getLink().endsWith("/users/1"),"Incorrect link");
    }
}
