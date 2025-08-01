package subSeq;

public class SubsequenceCheck {

    public static void main(String[] args) {
        String A = "ace";
        String B = "abcde";

        System.out.println(isSubsequence(A, B));  // true
    }

    static boolean isSubsequence(String A, String B) {
        int i = 0, j = 0;

        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == A.length();
    }
}

