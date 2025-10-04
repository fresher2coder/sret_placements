package arrayBasics;

import java.util.Scanner;

public class Array1D {

	public int[] getArray(int size) {
		
		Scanner scan = new Scanner(System.in);
		int array[] = new int[size];
		
		System.out.println("Enter " + size + " elements");
		
		for(int i=0; i<size; i++)
			array[i] = scan.nextInt();
		
		return array;
	}
	
	public void printArray(int array[]) {
		
		for(int i:array)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public int max(int array[]) {
		
		int max = array[0];
		
		for(int i:array) {
			
			if(i>max)
				max = i;
		}
		
		return max;			
	}
	
	void insert(int array[], int size, int pos, int value) {
		
		if(ifFull(array, size))
			System.out.println("Array is Full");
		else {
			//Shifting
			for(int i=size; i>pos; i--)
				array[i] = array[i-1];
			
			array[pos] = value;
		}
	}
	
	boolean ifFull(int array[], int size) {
		if(array.length == size)
			return true;
		else
			return false;
	}
	
	void delete(int array[], int size, int value) {
		if(isEmpty(size))
			System.out.println("Array is Empty");
		
		else {
			int pos = search(array, value, size);
			
			if(pos == -1)
				System.out.println(value + " is not found");
			else {
				for(int i=pos; i<=size-2; i++)
					array[i] = array[i+1];
				
				array[size-1] = 0;
				size--;
			}
		}			
	}
	
	boolean isEmpty(int size) {
		return size==0?true:false;
	}
	
	int search(int array[], int value, int size) {
		
		for(int i=0; i<size; i++) {
			if(array[i] == value)
				return i;		
		}
		
		return -1;
	}
	
	void leftRotation(int array[], int times) {
		int temp;
		while(times>0) {
			temp = array[0];
			
			for(int i=0; i<array.length-1; i++) 
				array[i] = array[i+1];
			
			array[array.length-1] = temp;			
			times--;
		}
	}
	
	void rightRotation(int array[], int times) {
		int temp;
		while(times>0) {
			temp = array[array.length-1];
			
			for(int i = array.length-1; i>0; i--)
				array[i] = array[i-1];
			
			array[0] = temp;
			times--;
		}
	}	
}



