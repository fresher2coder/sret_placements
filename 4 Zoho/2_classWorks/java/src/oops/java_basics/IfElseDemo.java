package oops.java_basics;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		IfElsePractice obj = new IfElsePractice();
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Enter the number to check odd or even");
		obj.oddEven(scan.nextInt());
		
		
		System.out.println("Enter the number to check perfect cube");
		obj.checkPerfectCube(scan.nextInt());
		*/
		
		System.out.println("Enter 3 numbers");
		obj.findGreatest(scan.nextInt(), scan.nextInt(), scan.nextInt());
		
		scan.close();
	}

}

class IfElsePractice{
	
	void oddEven(int num) {
		
		if(num % 2 ==0)
			System.out.println(num + " is an even number");
		else
			System.out.println(num + " is an odd number");
	}
	
	void checkPerfectCube(int num) {
		
		if((int)Math.pow((int)Math.cbrt(num), 3) == num)
			System.out.println(num + " is a perfect cube");
		else
			System.out.println(num + " is not a perfect cube");
	}
	
	void findGreatest(int a, int b, int c) {
		
		//Nested If-Else
		if(a>b)
		{
			if(a>c)
				System.out.println(a + " is the largest number");
			else
				System.out.println(c + " is the largest number");		
		}
		else {
			if(b>c)
				System.out.println(b + " is the largest number");
			else
				System.out.println(c + " is the largest number");
		}
		
		//Ladder If-Else-If
		if(a>b && a>c)
			System.out.println(a + " is the largest number");
		else if(b>a && b>c)
			System.out.println(b + " is the largest number");
		else
			System.out.println(c + " is the largest number");
		
		//Optimized
		
		int max = a;
		
		if(b>max)
			max = b;
		
		if(c>max)
			max = c;
		
		System.out.println(max + " is the largest number");
			
	}
}












