package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utils.TestSetupUtils;

public class ProductHomePage {

	public WebDriver driver;
	public String homepageValue;
	// public String offerpageValue;
	TestSetupUtils testSetupUtils;
	LandingPage landingPage;

	public ProductHomePage(TestSetupUtils testSetupUtils) {
		this.testSetupUtils = testSetupUtils;
	}

	@Given("User in GrenKart Landing page")
	public void user_in_gren_kart_landing_page() {

		System.setProperty("webdriver.chrome.driver", "D:\\ChrromeDriver\\chromedriver.exe");
		testSetupUtils.driver = new ChromeDriver();
		testSetupUtils.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("^User search for item (.+) and get the actual value$")
	public void user_search_for_item_and_get_the_actual_value(String itemName) throws InterruptedException {

		landingPage = new LandingPage(testSetupUtils.driver);

		boolean logo = landingPage.elementDisplayed();
		Assert.assertTrue(logo, "PAGE NAVIGATED TO HOMEPAGE AND LOGO DISPLAYED");

		landingPage.SearchText(itemName);
		Thread.sleep(2000);
		testSetupUtils.homepageValue = landingPage.getText().split("-")[0].trim();
		System.out.println(testSetupUtils.homepageValue + "Item Name Extracted from Home Page");

	}
}