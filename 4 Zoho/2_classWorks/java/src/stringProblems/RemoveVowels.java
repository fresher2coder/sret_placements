package stringProblems;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Interview";
        String result = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Without vowels: " + result);
    }
}

