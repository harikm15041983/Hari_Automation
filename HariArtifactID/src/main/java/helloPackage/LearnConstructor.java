package helloPackage;

public class LearnConstructor {
	
	String name;
	int age;
	
	public void persons() {
		
				
		System.out.println(name + "Age is : " + age);
	}
	
	LearnConstructor(String name) {
		this.name = name;
	}
	
	LearnConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
/*		LearnConstructor lc = new LearnConstructor();
		lc.persons();*/
		
		
		LearnConstructor lc1 = new LearnConstructor("Hari");
		lc1.persons();
		
		LearnConstructor lc2 = new LearnConstructor("Hari", 44);
		lc2.persons();

	}

}
