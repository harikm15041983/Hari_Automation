package stepDefinitions;

import io.cucumber.java.Before;

public class hooks {

	
	@Before("@GetListofValue")
	public void adminUser() {
		System.out.println("ADMIN USER BLOCK");
	}
	
	@Before("@Parameterisation")
	public void normalUser() {
		System.out.println("NORMAL USER BLOCK");
	}
}
