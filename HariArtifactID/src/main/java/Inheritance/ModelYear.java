package Inheritance;

public class ModelYear extends Vehicle{
	
	public void modYear() {
		System.out.println(" MoDEL YAER");
	}
	
	@Override
	public void hasBreak() {
		super.hasBreak();
		System.out.println(" xxx Child Has Break");
	}

}