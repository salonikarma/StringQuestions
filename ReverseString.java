
public class ReverseString {
    public static void main(String args[]) {
        String str = "Hello, world!";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb.toString()); // Print the reversed string
    }
}

