package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("user create given")
	public void user_create_given() {
	    System.out.println("Given method called");
	}

	@When("call when method")
	public void call_when_method() {
	    System.out.println("When method called");
	}

	@Then("verify the status code and response message")
	public void verify_the_status_code_and_response_message() {
	    System.out.println("Then method called");
	}
	
}
