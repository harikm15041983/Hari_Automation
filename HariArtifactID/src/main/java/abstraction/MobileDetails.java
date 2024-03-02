package abstraction;

public class MobileDetails implements Mobile{

	@Override
	public void mobileModel() {
		System.out.println("Mobile Model");
		
	}

	@Override
	public void mobileYear() {
		System.out.println("Mobile Year");
		
	}
	
	public static void main(String[] args) {
		Mobile mm = new MobileDetails();
		mm.mobileModel(); //Hiding the implementation [Navigate it will go to parent class abstract method]
		mm.mobileYear();
	}

}
