
public class PalindromeString {
    public static void main(String args[]) {
        String S = "HelloWorld";
        StringBuffer reversed = new StringBuffer(S);
        reversed.reverse();

        boolean isPalindrome = true;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != reversed.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(S + " is a palindrome.");
        } else {
            System.out.println(S + " is not a palindrome.");
        }
    }
}

