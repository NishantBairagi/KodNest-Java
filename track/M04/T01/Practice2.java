
import java.util.Scanner;

class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstText = sc.next();
        String secondText = sc.next();
        System.out.println("Exact match: " + firstText.equals(secondText));
        System.out.println("Ignore-case match: " + firstText.equalsIgnoreCase(secondText));
    }
}
