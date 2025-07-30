package oops.java_basics;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*ForLoop obj = new ForLoop();
		
		//obj.printHi(scan.nextInt());
		
		//obj.factorial(scan.nextInt());
		int l=scan.nextInt(), u = scan.nextInt();
		obj.printBreak(l, u);
		obj.printContinue(l, u);
		
		WhileLoop obj1 = new WhileLoop();
		//int num = scan.nextInt();
		//System.out.println("Reverse of " + num +": " + obj1.reverse(num));
		
		//obj1.palindrome(num);
		
		DoWhileLoop obj2 = new DoWhileLoop();
		//obj2.print();
		
		*/
		
		NestedLoop obj3 = new NestedLoop();
		int row = scan.nextInt();
		obj3.square(row);
		
		obj3.rectangle(row, scan.nextInt());
		
		obj3.rightTriangle(row);
		
		obj3.reverseRightTriangle(row);
		
		obj3.rightTriangle1(row);
		
		obj3.pramid(row);
	}

}

class ForLoop{
	
	void printHi(int times) {
		int i, j;
		
		for(i=1; i<=times; i++)
			System.out.println(i + ". HI");
		
		System.out.println("i value after for loop: " + i);
		
		for(i=1; i<=times; i+=2)
			System.out.println(i + ". HELLO");
		
		for(i=2; i<=times; i*=2)
			System.out.println(i + ". JAVA");
		
		for(i=times;i>0;i-=2)
			System.out.println(i + ". HI");
		
		for(i=1,j=times; i<=times && j>0; i++,j--)
			System.out.println(i + " " + j);
		
		/*
		for(;;)
			System.out.println("infinite");
		*/
	}
	
	void factorial(int num) {
		double fact = 1;
		
		if(num<0)
			System.out.println("No factorial for negative numbers");
		else {
			for(int i=1; i<=num; ++i)
				fact = fact * i;
			
			System.out.println(num +"! = " + fact);
		}	
	}
	
	void printBreak(int l, int u) {
		
		for(int i=l; i<=u; i++) {
			System.out.print(i + " ");
			
			if((int)Math.pow((int)Math.sqrt(i), 2) == i)
				break;		
		}
		System.out.println();
	}
	
	void printContinue(int l, int u) {
		
		for(int i=l; i<=u; i++) {	
			
			if((int)Math.pow((int)Math.sqrt(i), 2) == i)
				continue;
			
			System.out.print(i + " ");
		}
		System.out.println();
	}
}


class WhileLoop{
	
	int reverse(int num) {
		int rev = 0;
		
		while(num>0) {
			rev = rev *10 + num%10;
			num /= 10;
		}
		
		return rev;
		//System.out.println("Reverse of " + temp +": " + rev);
	}
	
	void palindrome(int num) {//258
		
		if(num == reverse(num)) //258 == 852
			System.out.println(num + " is Palindrome");
		else
			System.out.println(num + " is not Palindrome");
	}
}

class DoWhileLoop{
	
	void print() {
		int i = 0;
		
		while(i>0)
			System.out.println("Hi to While Loop");
		
		do {
			System.out.println("Hi to Do-While Loop");
		}while(i>0);
	}
}

class NestedLoop{
	
	void square(int side) {
		
		for(int r=1; r<=side; r++) {
			
			for(int c=1; c<=side; c++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	void rectangle(int b, int l) {
		
		for(int r=1; r<=b; r++) {
			
			for(int c=1; c<=l; c++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	void rightTriangle(int height) {
		
		for(int r=1; r<=height; r++) {
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	void reverseRightTriangle(int height) {
		
		for(int r=height; r>=1; r--) {
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	void rightTriangle1(int height) {
		
		for(int r=1; r<=height; r++) {
			
			for(int sp=1; sp<=height-r; sp++)
				System.out.print("  ");
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
	
	void pramid(int height) {
		
		for(int r=1; r<=height; r++) {
			
			for(int sp=1; sp<=height-r; sp++)
				System.out.print("  ");
			
			for(int c=1; c<=2*r-1; c++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
}	






