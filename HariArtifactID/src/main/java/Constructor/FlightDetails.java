package Constructor;

public class FlightDetails {
	
	String airlineName;
	String route;
	
	public FlightDetails(){
		System.out.println("FLights Details - WIthout Arguments");
	}
	
	public FlightDetails(String name, String routeNumber){
		airlineName = name;
		route = routeNumber;

	}
	
	public  void printFlightDetails() {
		
		//IF
		if(airlineName.equals("Emirates")){
			System.out.println("FLights Name : " +airlineName);
		}else if (route.equals("Non Stops"))
		{
			System.out.println("FLights Route : " +route);
		}		
		
		//SWITCH
		switch (airlineName) {
		case "Emirates" :
			System.out.println("Switch FLights Name : " +airlineName);
			break;
		case "American Airlines":
			System.out.println("Switch FLights Name : " +airlineName);
			break;	
		default:
			System.out.println("Flight Name is not EMirates");
			}
		
		//FOR
		for (int a = 1; a<=5; a++) {
			System.out.println("Foor Loop" +a);			
		}
		
		//WHILE
		int times = 0;
				while (times < 5) {
					System.out.println("WHile Loop " + times);
					times++;
				}
        // DO WHILE
		int doWhile = 0;
		do {
			System.out.println("DO While Loop" + doWhile);
			doWhile++;
		}while(doWhile<5);
	
	}
	

	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * FlightDetails fh = new FlightDetails(); fh.FlightDetails();
	 * fh.FlightDetails("Emirates", "Multiple Stops"); }
	 */

}
