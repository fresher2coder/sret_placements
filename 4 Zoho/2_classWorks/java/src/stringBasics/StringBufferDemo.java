package stringBasics;

//Synchronized - thread safe
public class StringBufferDemo {

	public static void main(String[] args) {

		String str = "Java Programming";
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.append(" is a best");
		sb.replace(20, 22, "the ");
		
		System.out.println(sb.toString());
		
		sb.delete(4, 16);
		
		System.out.println(sb.toString());
	}
}
