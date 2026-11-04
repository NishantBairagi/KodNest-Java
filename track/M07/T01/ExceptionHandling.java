
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

            int res = a / b;//compiler will not find the exception occure than it is called unchecked it will checked by compiler at runntime and dont force us to handle this at compile time

            System.out.println("Result: " + res);

        } catch (Exception e) {
            System.out.println("Divide by zero");
        }
        System.out.println("Connection terminated");

    }
}
