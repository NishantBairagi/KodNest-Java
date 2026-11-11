
import java.util.Scanner;

public class LocallyHandlingException {

    public static void main(String[] args) {
        System.out.println("Main method started");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handled in main method");
        }
        System.out.println("Main method completed");
    }

    public static void divide() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Divide method started");
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();

            int res = a / b;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Exception handled in dividion method");
            throw e;
        }
        System.out.println("Division completed");
    }
}
