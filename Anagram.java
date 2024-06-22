
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        // Check if either string is null
        if (a == null || b == null) {
            return false;
        }

        // Convert strings to character arrays
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        // Sort character arrays
        Arrays.sort(A);
        Arrays.sort(B);

        // Compare sorted arrays
        return Arrays.equals(A, B);
    }

    public static void main(String[] args) {
        // Example usage
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
