package arrayBasics;

import java.util.Scanner;

public class Array1DTester {

	public static void main(String[] args) {
			
		
		Array1D obj = new Array1D();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int a1[] = obj.getArray(scan.nextInt());
		
		System.out.println("Enter the size");
		int a2[] = obj.getArray(scan.nextInt());
	
		System.out.println("Array1: ");
		obj.printArray(a1);
		
		System.out.println("Array2: ");
		obj.printArray(a2);
		
		
		int max[] = new int[10];
		
		max[0] = obj.max(a1);
		max[1] = obj.max(a2);
		
		System.out.println("Max of max: " + obj.max(max));		
	}
}


