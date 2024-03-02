package helloPackage;

public class MyCar {
	
	//static String twoD = "yestwoD";
	String fourD = "yesfourD";

	public static void main(String[] args) {
		String twoD = "yestwoD";
		String fourD = "yesfourD";
		
		Car mm = new Car();
		
		String aa = mm.carName();
		
		System.out.println(aa);
		
		boolean bb = mm.isAvailable();
		
		System.out.println(bb);
		
		mm.methodOverloading("twoK", "fourL");
		mm.methodOverloading(22, 33);
		mm.methodOverloading(33.4, 55.8);

	}

}
