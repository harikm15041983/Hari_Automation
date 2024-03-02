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
import pageObject.OfferPage;
import utils.TestSetupUtils;

public class ProductOfferPage {

	// public WebDriver driver;
	// public String homepageValue;
	public String offerpageValue;
	TestSetupUtils testSetupUtils;
	OfferPage offerpage;
	LandingPage landingPage;

	public ProductOfferPage(TestSetupUtils testSetupUtils) {
		this.testSetupUtils = testSetupUtils;
	}

	@Then("^User search for item (.+) in Offerpage and validate the value$")
	public void user_search_for_item_in_offerpage_and_validate_the_value(String itemName2) {
		swithOfferPage();

		offerpage = new OfferPage(testSetupUtils.driver);
		offerpage.searchText(itemName2);

		offerpageValue = offerpage.getText();
		System.out.println(offerpageValue + "Item Name Extracted from OFFER Page");

	}

	public void swithOfferPage() {
		landingPage = new LandingPage(testSetupUtils.driver);
		
		landingPage.clickDealsLink();

		Set<String> s1 = testSetupUtils.driver.getWindowHandles();
		Iterator<String> il = s1.iterator();
		String parentWindow = il.next();
		String childWindow = il.next();
		testSetupUtils.driver.switchTo().window(childWindow);

	}

	@Then("Validate value in HomePage and Offerpage")
	public void Validate_value_in_HomePage_and_Offerpage() {

		Assert.assertEquals(testSetupUtils.homepageValue, offerpageValue, "Value Matched");

	}

}