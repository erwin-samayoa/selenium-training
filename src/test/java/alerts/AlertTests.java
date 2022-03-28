package alerts;

import base.BaseTests;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Incorrect alert result");
    }

    @Test
    public void testGetTestFromAlert() {
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text error");
    }

    @Test
    public void setInputInAlert() {
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alert_setText(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + text,"Incorrect prompt");

    }
}
