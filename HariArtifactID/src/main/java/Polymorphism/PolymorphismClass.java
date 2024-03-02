package Polymorphism;

public class PolymorphismClass {
	
	//Method Overloading
	public void flightDetails(String flightName, String routName) {
		System.out.println("Flight Name :"+flightName + "Route Name" +routName);
	}
	
	public void flightDetails(int flightCount) {
		System.out.println("FLight Details = " +flightCount);
	}

	public boolean flightDetails(boolean flightAvailable) {
		System.out.println("FLight Available = " +flightAvailable);
		return true;
	}
}