package stepdefinition;

import io.cucumber.java.After;

public class Hooks {
	
	@After
	public void closeBroswer() {
		
		//driver.quit();
	}

}