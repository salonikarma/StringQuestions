
public class LongestPalindromeInString {
    public static void main(String[] args) {
        String S = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalin(S));
    }

    static String longestPalin(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }

        // Create palindrome substring
        String sub = S.substring(0, 1);

        // Running loop over the string
        for (int i = 0; i < S.length(); i++) {
            // For odd length palindromes
            String oddPalin = expandAroundCenter(S, i, i);
            if (oddPalin.length() > sub.length()) {
                sub = oddPalin;
            }

            // For even length palindromes
            String evenPalin = expandAroundCenter(S, i, i + 1);
            if (evenPalin.length() > sub.length()) {
                sub = evenPalin;
            }
        }

        return sub;
    }

    // Helper method to expand around the center
    static String expandAroundCenter(String S, int left, int right) {
        while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
            left--;
            right++;
        }
        return S.substring(left + 1, right);
    }
}

