package stringBasics;

//Not Synchronized - not thread safe
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String str = "Java Programming";
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.append(" is a best");
		sb.replace(20, 22, "the ");
		
		System.out.println(sb.toString());
		
		sb.delete(4, 16);
		
		System.out.println(sb.toString());
		
		//Palindrome
		
		if(str.equals(sb.reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
