
import java.util.Scanner;

class Practice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String keyword = sc.next();

        String normalized = sentence.trim().toLowerCase();
        System.out.println("Normalized text: " + normalized);
        System.out.println("Contains keyword: " + normalized.contains(keyword.toLowerCase()));
    }
}
