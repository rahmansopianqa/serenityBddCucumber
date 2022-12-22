package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import starter.dashboardPage.dashboardPage;
import starter.loginPage.loginPage;

public class LoginStepDefinitions {

    @Steps
    loginPage login;

    @Steps
    dashboardPage dash;


    @Given("user is on login page")
    public void navigateToLoginPage() {
        login.openAplication();
    }

    @When("user enter admin@local as username")
    public void enterUsername() {
        login.username("admin@local");
    }

    @When("user enter ramo@123!@# as password")
    public void enterPassword() {
        login.password("ramo@123!@#");
        login.clickBtnLogin();
    }

    @Then("user should be able to login")
    public void should_see_information_about() {
        dash.verifyDashboard();
    }
}
