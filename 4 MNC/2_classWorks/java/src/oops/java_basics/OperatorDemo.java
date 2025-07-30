package oops.java_basics;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Enter a:");
		a = scan.nextDouble();
		
		System.out.println("Enter b:");
		b = scan.nextDouble();
		scan.close();
		
		System.out.println("Sum: " + (a+b));
		System.out.println("Diff: " + (a-b));
		System.out.println("Product: " + (a*b));
		System.out.println("Quotient: " + (int)(a/b));
		System.out.println("Reminder: " + (int)(a%b));
		
		System.out.println("PostInc: " + a++);// Assign then increment
		System.out.println("PreInc: " + ++a); // Increment then assign
		
		//a = 10;
		System.out.println(( 15 + 5 - 8 * 10 / 2 * a++));
		
		System.out.println(12/5.0*6);	
		
		double max = a>b?a:b;
		System.out.println("Max: " + max);
		
		System.out.println(a>b?"a is larger":"a is smaller");
			

	}

}
