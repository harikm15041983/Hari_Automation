package excrptionHandling;

public class ExceptionClass {
	
	public void addNumber() {
		try {
		int a = 0;
		int b = 20;

		int c = b/a;
		System.out.println("add number: " +c);
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Arithmetaic Unable to ADD with Sting");
		}
		catch (Exception e) {
			System.out.println("Unable to ADD with Sting");
		}
		finally {
			System.out.println("Logic executed");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionClass add = new ExceptionClass();
		add.addNumber();

	}

}
