package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchText = By.className("search-keyword");

	By productName = By.cssSelector("h4.product-name");
	
	By dealLink = By.linkText("Top Deals");


	public void SearchText(String name) {
		driver.findElement(searchText).sendKeys(name);
	}
	
	public String getText( ) {
		return driver.findElement(productName).getText();
	}
	
	public boolean elementDisplayed() {
		return  driver.findElement(searchText).isDisplayed();
	}
	
	public void clickDealsLink( ) {
		 driver.findElement(dealLink).click();
	}

}
