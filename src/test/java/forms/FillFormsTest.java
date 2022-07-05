package forms;

import base.BaseTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ThanksPage;

import static org.testng.Assert.assertEquals;

public class FillFormsTest extends BaseTests {

    @BeforeMethod
    public void initializeTest() {
        formPage.load();
    }

    @Test
    public void fillFormMale() {
        formPage.setFirstName("Juan");
        formPage.setLastName("López");
        formPage.setJobTitle("Lic.");
        formPage.setEducationLevel(2);
        formPage.setSex(1);
        formPage.setYearsOfExperience(3);
        formPage.setDate("01/01/2000");

        ThanksPage thanksPage = formPage.clickSubmitButton();
        //System.out.println(thanksPage.getResultText());
        assertEquals(thanksPage.getResultText(),"The form was successfully submitted!","Error while submitting form");



    }
    @Test
    public void fillFormFemale() {
        formPage.setFirstName("Juana");
        formPage.setLastName("López");
        formPage.setJobTitle("Dr.");
        formPage.setEducationLevel(3);
        formPage.setSex(2);
        formPage.setYearsOfExperience(3);
        formPage.setDate("01/01/2000");
        ThanksPage thanksPage = formPage.clickSubmitButton();
        assertEquals(thanksPage.getResultText(),"The form was successfully submitted!","Error while submitting form");
    }
}
