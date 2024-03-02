package InterfaceRBI;

public interface LearnInterface {
	
	int UPILimit = 100000;
	
	public void adharMandatory(); //abstract Method
	public boolean panMandatory(); //abstract Method
	
	public void RBILimit(); //abstract Method

	public default void interfaceSelfMethod() {
		System.out.println("default interface slef method");
	}
	
	public static void interfaceSelfMethod1() {
		System.out.println("static interface slef method");
	}
	
}
