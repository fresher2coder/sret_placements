package stringProblems;

//Compress String (e.g., aabcc → a2b1c2)

public class CompressString {
    public static void main(String[] args) {
        String str = "aabcc";
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append last character and count
        compressed.append(str.charAt(str.length() - 1)).append(count);
        System.out.println("Compressed: " + compressed);
    }
}
