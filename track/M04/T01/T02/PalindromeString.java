
import java.util.Scanner;

class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        //reverse String
        for (int i = word.length() - 1; i >= 0; i--) {
            rev.append(word.charAt(i));
        }
        String reverse = rev.toString();
        System.out.println("Reversed: " + reverse);
        System.out.println("Palindrome: " + reverse.equalsIgnoreCase(word));
    }
}
