package helloPackage;

public class Car {
	
	String carname = "Nissan";
	String carmodel = "Altima";

	public String carName() {
		
		System.out.println(carname);
		System.out.println(carmodel);
		return (carmodel);
	
	}
	
	public boolean isAvailable() {
		
		System.out.println("Car is Available");
		
		return true;
		
	}
	
	public void methodOverloading (String twoD, String fourD) {
		
		System.out.println("Overloading success : " + twoD + "  " + fourD);
		
	}
	
	public void methodOverloading (int aint, int bint) {
		System.out.println(aint + bint);
	}
	
	public void methodOverloading (double adouble, double bdouble) {
		System.out.println(adouble + bdouble);
	}
	
	
	
}
