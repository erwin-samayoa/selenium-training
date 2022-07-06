import base.BaseTests;
import forms.FillFormsTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ThanksPage;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class Steps extends BaseTests {

    protected ThanksPage thanksPage;

    @Before
    public void initialize() {
        SetUp();
    }

    @Given("I am in the register page of the site")
    public void iAmInTheRegisterPageOfTheSite() {
        formPage.load();
    }

    @Then("I should be taken to the successful page")
    public void iShouldBeTakenToTheSuccessfulPage() {

        //System.out.println(thanksPage.getResultText());
        assertEquals(thanksPage.getResultText(),"The form was successfully submitted!","Error while submitting form");
    }

    @When("I enter register data")
    public void iEnterMaleRegisterData(DataTable table) {
        List<List<String>> data = table.asLists();
        formPage.setFirstName(data.get(0).get(0));
        formPage.setLastName("López");
        formPage.setJobTitle("Lic.");
        formPage.setEducationLevel(2);
        if (data.get(0).get(1).equals("Male")) {
            formPage.setSex(1);
        } else {
            formPage.setSex(2);
        }
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

    @After
    public void closeAll() {
        tearDown();
    }
}
