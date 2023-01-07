package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.dashboardPage.dashboardPage;
import starter.taxesPage.taxesPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaxesStepDefinitions {

    @Steps
    dashboardPage dash;

    @Steps
    taxesPage taxes;
    @Given("^User click Master Data Menu$")
    public void user_in_dashboard() throws Throwable {
        dash.masterDataMenu();
    }
    @When("^User click Taxes Menu$")
    public void user_click_taxes_menu() throws Throwable {
        dash.taxesMenu();

    }
    @Then("^Taxes list should be displayed$")
    public void taxes_list_should_be_displayed() throws Throwable {
        assertTrue(String.valueOf(true),taxes.verifyListTaxes());
    }
    @When("^User click add taxes$")
    public void user_click_add_taxes() throws Throwable {
        taxes.clickBtnAddTaxes();
    }
    @And("^User choose type PPN, input \"([^\"]*)\" as rate, input \"([^\"]*)\" as description$")
    public void user_choose_type_ppn_input_something_as_rate_input_something_as_description(String rate, String description) throws Throwable {
        taxes.chooseType();
        taxes.inputRate(rate);
        taxes.inputDescription(description);
    }
    @And("^User click button save$")
    public void user_click_button_save() throws Throwable {
        taxes.clickbtnsave();
    }
    @Then("^Taxes should be created$")
    public void taxes_should_be_created() throws Throwable {
        assertEquals(true, taxes.verifySucces());
    }


}

