package Constructor;

public class getFlightDetails extends FlightDetails{
	
	public static void main(String[] args) {
		
		//Parameterized constructor Explained
		/*
		 * FlightDetails getFlight = new FlightDetails("American Airline", "4 Stops");
		 * getFlight.printFlightDetails();
		 */
		
		FlightDetails getFlight1 = new FlightDetails("Emirates", "Non Stops");
		getFlight1.printFlightDetails();
		
		//Default constructor
		FlightDetails getFlight2 = new FlightDetails();
		//getFlight2.FlightDetails();
		
		
	
	}

}
