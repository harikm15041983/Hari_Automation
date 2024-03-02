package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given ("Clear Browser Cache")
	public void cacheClear() {
		System.out.println("PreRequsite : Clear Brower Cache");
	}

	@When("Open the Chrome Browser")
	public void openBrowser() {
		System.out.println("PreRequsite : Open Chrome Browser");
	}
	
	//1
	@Given("User lands on Login page")
	public void user_lands_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Parameterisation  ----  User lands on Login page");
	}
	@When("User enter the UserName as {string} and Password as {string}")
	public void user_enter_the_user_name_and_password(String userName, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("USER NAME IS : " +userName + "PASSWORD IS : " +password);
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed");
	}
	@And("Check Name is displayed")
	public void check_name_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("check_name_is_displayed");
	}
	
//2
@Given("User lands on Login page to get the details")
public void user_lands_on_login_page_to_get_the_details() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("GetListofValue  ---------  To Get the LIST of Values");
}

@When("User enter the UserName as FirtName, LastName, EMail")
public void user_enter_the_user_name_as_firt_name_last_name_e_mail(List<String> data) {
	
	System.out.println("First Name :" + data.get(0));
	System.out.println("Last Name :" + data.get(1));
	System.out.println("Email :" + data.get(2));

}




}