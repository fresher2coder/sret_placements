package java_oops.polymorphism;

public class Demo {
	
	public static void main(String arg[]) {
		Calculator calc = new Calculator();
		
		System.out.println("int int: " + calc.add(new double[]{10l, 20}));
		System.out.println("int int: " + calc.add(new double[]{10, 20, 30}));
		System.out.println("int int: " + calc.add(new double[]{10, 20, 30, 40}));
		
	}
}

//method overloading
class Calculator{
	
//	public double add(double a, double b) {
//		return a+b;
//	}	
//	
//	public int add(int a, int b, int c) {
//		return a+b+c;
//	}
//	
//	public int add(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
	
	public double add(double []nums) {
		
		double sum = 0;
		for(double n: nums) {
			sum += n;
		}
		
		return sum;
	}
}

/*
 * same method name
 * 1. diff no of var
 * 2. diff datatype
 * 3. X by changing return type alone
 * 4. type promotion - largest datatype
 */
