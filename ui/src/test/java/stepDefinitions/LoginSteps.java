package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Saucedemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        // Open the login page
        loginPage.open();
        loginPage.showLoginLogo();
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        // Enter username and password, click login
        loginPage.login(username, password);
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String errorMessage) {
        // Assert error message
        loginPage.showErrorMessage();
    }
}
