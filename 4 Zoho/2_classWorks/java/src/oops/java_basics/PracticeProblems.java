package oops.java_basics;

import java.util.Scanner;
import java.lang.Math;

public class PracticeProblems {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number:");
		num = scan.nextInt();
		//Unit Digit
		System.out.println("Unit digit of " + num + " : " + (int)Math.abs(num%10));
		
		System.out.println("Enter the kth value:");
		int k = scan.nextInt();
		
		//Kth digit
		System.out.println(k +"th digit of " + num +" : " + (int)Math.abs(num/((int)Math.pow(10, k-1))%10));
		
		
		//no of odd and even
		System.out.println("Enter the Number:");
		num = scan.nextInt();
		
		System.out.println("No of even nos: " + num/2);
		System.out.println("No of odd nos: " + (num - (num/2)));
		
		//Perfect Square
		System.out.println("Enter the Number:");
		num = scan.nextInt();
		
		System.out.print("Is the " + num + " perfect square : ");
		System.out.println((int)Math.pow((int)Math.sqrt(num), 2) == num?"Yes" : "No");
		
		
		
	}

}
