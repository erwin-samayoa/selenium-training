import base.BaseTests;
import forms.FillFormsTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ThanksPage;

import static org.testng.Assert.assertEquals;

public class Steps extends BaseTests {

    protected ThanksPage thanksPage;

    @Given("I am in the register page of the site")
    public void iAmInTheRegisterPageOfTheSite() {
        SetUp();
        formPage.load();
    }

    @Then("I should be taken to the successful page")
    public void iShouldBeTakenToTheSuccessfulPage() {

        //System.out.println(thanksPage.getResultText());
        assertEquals(thanksPage.getResultText(),"The form was successfully submitted!","Error while submitting form");
    }

    @When("I enter male register data")
    public void iEnterMaleRegisterData() {
        formPage.setFirstName("Juan");
        formPage.setLastName("López");
        formPage.setJobTitle("Lic.");
        formPage.setEducationLevel(2);
        formPage.setSex(1);
        formPage.setYearsOfExperience(3);
        formPage.setDate("01/01/2000");
    }

    @When("I enter {string} and {string} register data")
    public void iEnterAndRegisterData(String name, String sex) {
        formPage.setFirstName(name);
        formPage.setLastName("López");
        formPage.setJobTitle("Lic.");
        formPage.setEducationLevel(2);
        if (sex.equals("Male")) {
            formPage.setSex(1);
        } else {
            formPage.setSex(2);
        }
        formPage.setYearsOfExperience(3);
        formPage.setDate("01/01/2000");
    }

    @And("I click submit button")
    public void iClickSubmitButton() {
        thanksPage = formPage.clickSubmitButton();
    }
}
