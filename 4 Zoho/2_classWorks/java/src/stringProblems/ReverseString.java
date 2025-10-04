package stringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Placement";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}

