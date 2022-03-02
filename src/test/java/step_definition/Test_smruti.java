package step_definition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_smruti {
	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() {
		  System.out.println("user_Logout_from_the_Application()");
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
		  System.out.println("message_displayed_Logout_Successfully()");
	}
}
