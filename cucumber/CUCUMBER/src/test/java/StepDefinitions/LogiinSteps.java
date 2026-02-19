package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogiinSteps {

	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.out.println("user is in login page");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page");
		
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		System.out.println("user enters {string} and {string}");
	
	}
	@Then("user should remain on login page")
	public void user_should_remain_on_login_page() {
		System.out.println("user should remain on login page");
	}
}
