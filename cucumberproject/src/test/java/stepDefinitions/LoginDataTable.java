package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataTable {
	WebDriver driver;

	@Given("Login into the application")
	public void login_into_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\ChrromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("Enter UserName and Password")
	public void enter_user_name_and_password(DataTable value) {
		List<String> valulist = value.asList(String.class);
		String usrName = valulist.get(0);
		String pwd = valulist.get(1);
		
		driver.findElement(By.id("user-name")).sendKeys(usrName);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@And("Click on Submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Check for the Home Page")
	public void check_for_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
