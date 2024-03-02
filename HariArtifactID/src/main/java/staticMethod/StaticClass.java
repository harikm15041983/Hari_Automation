package staticMethod;

public class StaticClass {
	
	//Static Variable
	static int sValue;
	int nsVlaue = 20;
	
	//Static Block
	static {
		System.out.println("Static Block");
	}
	
	public static void Method1() {
		System.out.println("Static Method");
		sValue = 2000;
	}

	public static void main(String[] args) {
		/*
		 * StaticClass sc = new StaticClass(); sc.Method1();
		 */
		
		// Static Method can able to call without creating the Object
		Method1();
		
	}
}
