package oops.java_basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		SwitchPractice obj = new SwitchPractice();
		
		//obj.printDay(scan.nextInt());
		
		//obj.printDay(scan.next().charAt(0));
		
		//obj.printDay(scan.next());
		
		obj.printAlterDays(scan.nextInt());

	}

}

class SwitchPractice{
	
	void printDay(int dayOrder) {
		
		switch((dayOrder-1) % 7)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day order");
		}
		
		System.out.println("Day is printed");
	}
	
	void printDay(char ch) {
		
		switch('s')
		{
		case 's':
		case 'S':
			System.out.println("Sunday");
			break;
		case 'M':
			System.out.println("Monday");
			break;
		case 'T':
			System.out.println("Tuesday");
			break;
		case 'W':
			System.out.println("Wednesday");
			break;
		case 'H':
			System.out.println("Thursday");
			break;
		case 'F':
			System.out.println("Friday");
			break;
		case 'R':
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid character");
		}
	}
	
	void printDay(String day) {
		
		switch(day)
		{
		default:
			System.out.println("Invalid day");
			break;
		case "sun":
			System.out.println("Sunday");
			break;
		case "mon":
			System.out.println("Monday");
			break;
		case "tues":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thur":
			System.out.println("Thursday");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;
		
		}
	}
	
	void printAlterDays(int dayOrder) {
		
		switch((dayOrder-1) % 7)
		{
		case 0:
			System.out.println("Sunday");			
		case 2:
			System.out.println("Tuesday");			
		case 4:
			System.out.println("Thursday");			
		case 6:
			System.out.println("Saturday");
			break;
		
		case 1:
			System.out.println("Monday");			
		case 3:
			System.out.println("Wednesday");		
		case 5:
			System.out.println("Friday");
			break;
		
		default:
			System.out.println("Invalid day order");
		}
	}
	
}














