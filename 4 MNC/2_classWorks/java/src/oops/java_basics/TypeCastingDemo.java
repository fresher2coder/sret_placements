package oops.java_basics;

public class TypeCastingDemo {

	public static void main(String[] args) {

		long mobile = 9876543210l;
		
		System.out.println("Mobile_Long: " + mobile);
		
		//Widening Casting or Implicit casting
		
		int i = 10;
		long l = i;
		double d = l;
		
		System.out.println("Int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Double: " + d);
		
		//Narrow Casting or Explicit casting
		
		double d1 = 9999999991578.25795;
		long l1 = (long)d1;
		int i1 = (int)l1;
		
		System.out.println("Int: " + i1);
		System.out.println("Long: " + l1);
		System.out.println("Double: " + d1);
		
		
		float f = 10 + 15.25f;
		
		System.out.println("Float f: " + f);
		
		float f1 = 10 + (float)15.25;
		System.out.println("Float f: " + f);
		
		int a = 11, b = 12;
		
		float avg = ((float)a+b)/2;
		
		System.out.println("Average: " + avg);
		
		char ch = 'a';
		int i2 = ch;
		double d2 = ch;
		
		System.out.println("Char ch: " + ch);
		System.out.println("int i2: " + i2);
		System.out.println("double d2: " + d2);
		
		short s = (short)ch;
		System.out.println("short s1: " + s);
		
		byte b1 = (byte)-129; //-128 to 127
		System.out.println("Byte : " + b1);

	}

}




