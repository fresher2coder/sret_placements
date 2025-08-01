package arrayBasics;

public class Array2DTester {

	public static void main(String[] args) {
						
		Array2D obj = new Array2D();
		
		int a1[][], b1[], c1;
		
		int[] a2, b2[], c2;
		
		int a3[][] = new int[][]{ {10, 20, 50}, {30, 40} };
		
		b2 = new int[2][2];
		
		b2[0][0] = 100;
		
		obj.printArray(a3);
		
		int a[][] = obj.getArray(2, 2);
		int b[][] = obj.getArray(2, 2);
		
		int total[][] = obj.addition(a, b);
		
		obj.printArray(total);
		

	}

}

/*
 *[[10 20],
 * [30 40]]
 * 
 */
