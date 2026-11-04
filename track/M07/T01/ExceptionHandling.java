
import java.util.Scanner;

class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Connnection established");
        try {
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();

            int res = a / b;

            System.out.println("Result: " + res);

        } catch (Exception e) {
            System.out.println("Divide by zero");
        }
        System.out.println("Connection terminated");

    }
}
