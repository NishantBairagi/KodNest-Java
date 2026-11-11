
import java.util.Scanner;

public class ThrowsKeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main method started");
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main method");
        }
        System.out.println("Main method completed");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
