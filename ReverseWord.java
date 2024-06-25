
public class ReverseWord {
    String reverseWords(String S) {
        // Split the input string by literal dots (escaped as "\\.")
        String[] words = S.split("\\.");

        // Initialize a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Append the words in reverse order, with dots between them
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) { // Avoid appending empty strings
                reversed.append(words[i]);
                if (i != 0) {
                    reversed.append(".");
                }
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWord reverser = new ReverseWord();
        String input = "hello.world";
        String reversedString = reverser.reverseWords(input);
        System.out.println("Reversed string: " + reversedString); // Output: "world.hello"
    }
}
