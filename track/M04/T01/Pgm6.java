
import java.util.Scanner;

class Pgm6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int vowelCounts = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCounts++;
            }
        }
        System.out.println("vowel counts: " + vowelCounts);
    }
}
