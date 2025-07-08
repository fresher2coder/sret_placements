package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		
		
		double a = 1;
		Double a1 = a;
		
		a = a1;
		
		ArrayList numbers = new ArrayList();
		a = 10;
		numbers.add(a);
		numbers.add(20.5);
		numbers.add('a');
		numbers.add("collections");
		
		System.out.println(numbers);
		
		for(Object num : numbers) {
			System.out.println(num);
		}
		
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Integer> nums2 = new ArrayList<>();
		
		nums.add(10);
		nums.add(20);
		nums.add(1, 15);
		nums.addAll(nums2);
		
		System.out.println(nums.get(0));
		
		nums.set(0, 100);
		nums.remove(0);
		for(Integer n: nums) {
			System.out.println(n);
		}		
		
		System.out.println(nums.indexOf(100));
		System.out.println(nums.contains(10));
		
		//conversion
		Object numsArray[] = nums.toArray();
		
		Stack<Integer> stack = new Stack<>();
		
		Deque<Double> name = new Deque<>();
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		

	}

}
