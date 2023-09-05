import java.util.Scanner;

public class JavaCase3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(checkOnPalindrome(word));
    }
    public static boolean checkOnPalindrome(String word) {
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int start = 0;
        int end = length - 1;
        while (end > start) {
            char startChar = clean.charAt(start++);
            char endChar = clean.charAt(end--);
            if (startChar != endChar)
                return false;
        }
        return true;
    }
}
