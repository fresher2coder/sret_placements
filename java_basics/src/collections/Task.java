package collections;

import java.util.*;

public class Task {

	public static void main(String[] args) {

		String sentense = "Java is easy and Java is powerful";
		
		Task task = new Task();
		System.out.println("Unique Texts: " + task.task1(sentense));
		
		 task.freqCounter("banana");
		 
		 task.sort();

	}
	
	public String task1(String sentence) {		
		
		String[] words = sentence.split(" ");
		
		Set<String> uniq = new LinkedHashSet<>(Arrays.asList(words));
		
		System.out.println(uniq);
		
		String result = "";
		
		for(String word: uniq) {
			result = result + " " +  word;
		}
		return result;
	}
	
public                     void freqCounter(String word) { //b a n a na
		
		
		//freq array[0, 0, 0, 0, 0], hashmap { } {b:1, a:3, n:2}
		Map<Character, Integer> freqmap = new LinkedHashMap<>();
		
		for(char ch: word.toCharArray()) {
			
			freqmap.put(ch, freqmap.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(freqmap);
		
		int[] freqArray = new int[128];
		
		for(char ch: word.toCharArray()) {
			
			freqArray[ch] += 1;
		}		
	}
	
	public void sort() {
		
		
		List<Integer> list = Arrays.asList(5, 2, 1, 7, 0, 6);
		
		list.sort((a, b)-> b-a);		//n log n - QuickSort
		System.out.println(list);
		
		
	 Collections.sort(list);
	 Collections.reverse(list);
		
		System.out.println(list);
		
		List<Student> stus = new ArrayList<>();
		
		stus.add(new Student(110, "dK"));
		stus.add(new Student(101, "aK"));
		stus.add(new Student(112, "cK"));
		stus.add(new Student(103, "bK"));
		stus.add(new Student(105, "eK"));
		
		
		stus.sort((stu1, stu2)->stu1.rollNo-stu2.rollNo);
		System.out.println(stus);
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("banana", 5);
		map.put("apple", 15);
		map.put("cherry", 3);
		map.put("orange", 6);
		
		//key
		map
			.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(System.out::println);
		
		map
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
		
		
	}
}


class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	
}


























