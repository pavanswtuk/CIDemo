package co.uk.mailnewspapers.ci;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("the user Login page")
    public void the_user_login_page() {
        System.out.println("user Login page");
    }
    @When("user login with credentials")
    public void user_login_with_credentials() {
        System.out.println("login with credentials");
    }
    @Then("user should see Products page")
    public void user_should_see_products_page() {
        System.out.println("user should see Products page commit");
    }

}
