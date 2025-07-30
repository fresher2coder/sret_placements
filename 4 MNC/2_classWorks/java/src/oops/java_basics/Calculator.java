package oops.java_basics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter a:");
		a = scan.nextInt();
		
		System.out.println("Enter b:");
		b = scan.nextInt();	
		
		scan.close();
		
		System.out.println("Sum: " + (a+b));

	}

}
