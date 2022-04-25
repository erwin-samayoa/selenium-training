package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator() {
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBAck();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://www.google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
