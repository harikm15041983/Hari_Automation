package helloPackage;

public class LearnThisInstance {
	
	int c = 50;
	
	public void addTwonumber(int a, int b) {
		int c = 30;
		System.out.println(a+b+this.c);
	}
	
	public static void main(String[] args) {
		LearnThisInstance ll = new LearnThisInstance();
		
		ll.addTwonumber(1, 6);
	}

}
