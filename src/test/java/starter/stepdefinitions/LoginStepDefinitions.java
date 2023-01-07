package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.dashboardPage.dashboardPage;
import starter.loginPage.loginPage;

import static org.junit.Assert.*;


public class LoginStepDefinitions {

    @Steps
    loginPage login;

    @Steps
    dashboardPage dash;


    @Given("^User navigate to login page$")
    public void user_is_on_login_page() throws Throwable {
        login.openAplication();

    }
    @When("^User enter \"([^\"]*)\" as username$")
    public void user_enter_something_as_username(String username) throws Throwable {
        login.username(username);

    }
    @When("^User enter \"([^\"]*)\" as password$")
    public void user_enter_something_as_password(String password) throws Throwable {
        login.password(password);
        login.clickBtnLogin();
    }
    @Then("^User dashboard should be displayed$")
    public void user_dashboard_should_be_displayed() throws Throwable {
        assertEquals(true ,dash.verifyDashboard());
    }
    @Then("^User dashboard should not be displayed$")
    public void user_dashboard_should_not_be_displayed() throws Throwable {
        assertNotEquals(false, dash.verifyDashboard());
    }
}
