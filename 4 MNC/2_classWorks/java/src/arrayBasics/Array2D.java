package arrayBasics;

import java.util.Scanner;

public class Array2D {

	void printArray(int array[][]) {
	
		for(int r=0; r<array.length; r++) {
			
			for(int c=0; c<array[r].length; c++)
				System.out.print(array[r][c] + " ");
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	int[][] getArray(int row, int column){
		
		int array[][] = new int[row][column];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter " + row*column + " elements");
		
		for(int r=0; r<array.length; r++) {
			
			for(int c=0; c<array[r].length; c++)
				array[r][c] = scan.nextInt();
		}	
		return array;
	}
		
	int [][] addition(int a[][], int b[][]){
		
		int sum[][] = new int[a.length][a[0].length];
		
		for(int r=0; r<sum.length; r++) {
			
			for(int c=0; c<sum[r].length; c++)
				sum[r][c] = a[r][c] + b[r][c];
		}
		return sum;
	}
	
	int[][] multiplication(int a[][], int b[][]){
		
		int pro[][] = new int[a.length][a[0].length];
		
		for(int r=0; r<a.length; r++) {
			
			for(int c=0; c<b[0].length; c++) {
				
				for(int k=0; k<b[0].length; k++)
					pro[r][c] += a[r][k] * b[k][c];
			}
		}
		
		return pro;
	}
	
	
}
