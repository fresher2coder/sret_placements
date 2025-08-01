package stringBasics;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String str = "Java Programming is the best";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println("Total tokens: " + st.countTokens());
		
		System.out.println();
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
