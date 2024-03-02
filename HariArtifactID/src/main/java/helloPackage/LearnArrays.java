package helloPackage;

import java.util.Arrays;

public class LearnArrays {
	
	public void arr () {
		String[] names = {"Hari", "Krishna", "Moorthy"};
		
		System.out.println(Arrays.toString(names));
		System.out.println(names[2]);
	}
	
	public void arr1() {
		int[] age = new int[3];
		age[0] = 2;
		age[1] = 22;
		age[2] = 22;
		
		System.out.println(Arrays.toString(age));
	}
	
	public static void main(String[] args) {
		LearnArrays la = new LearnArrays();
		la.arr();
		la.arr1();
		
	}

}
