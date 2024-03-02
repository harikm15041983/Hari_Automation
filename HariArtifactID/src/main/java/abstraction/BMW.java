package abstraction;

public class BMW extends Cars{

	
	@Override
	public void engineSecreate() {
		System.out.println("BMW - engine valut");
		
	}
	
	public static void main(String[] args) {
		Cars cc = new BMW();
		cc.engineSecreate(); //Hiding the implementation [Navigate it will go to parent class abstract method]
		cc.engineValult();
	}
}

