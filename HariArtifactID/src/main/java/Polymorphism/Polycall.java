package Polymorphism;

public class Polycall extends PolymorphismClass{
	
	@Override
	public void flightDetails(int flightCount) {
		System.out.println("Flight Count Override : "+flightCount);
		
	}
	
	public static void main(String[] args) {
		PolymorphismClass pc = new Polycall();
		
		//Method Overloading
		pc.flightDetails("Emirates", "OneStope");
		pc.flightDetails(true);

		//Method Overriding
		pc.flightDetails(5);
		
		
		
	}

}
