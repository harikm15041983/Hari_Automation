package Inheritance;

public class Model extends ModelYear{

	public void modelName() {
		System.out.println("Modle Name");
		}
	
	
	public static void main(String[] args) {
		
		Model mod = new Model();
		mod.modelName();
		
		//ParentClass Method
		mod.hasBreak();
		mod.hasHorn();
		
	}
	
}