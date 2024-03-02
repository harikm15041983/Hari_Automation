package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class OpenGoogleDefinitions {
	WebDriver driver;
	
	@Given("^user is enter google\\.co\\.in$")
	public void user_is_enter_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChrromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    
	}

	@When("^user is typing \"([^\"]*)\"$")
	public void user_is_typing(String searchTerm) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		//driver.findElement(By.)
	    
	}

	@When("^enters the return key$")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	}

	@Then("^user should see the search result$")
	public void user_should_see_the_search_result() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("Hari")).isDisplayed();
		if(status==true) {
			System.out.println("Result Displayed");
			driver.close();
		}
	    
	}

}
