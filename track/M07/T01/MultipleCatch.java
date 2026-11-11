
import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection established");
        try {
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();

            int res = a / b;
            System.out.println("result: " + res);

            System.out.println("Enter the size of array");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter element to add in an array");
            int element = sc.nextInt();

            System.out.println("Enter index where you want to add element");
            int index = sc.nextInt();

            arr[index] = element;
        } catch (ArithmeticException e1) {
            e1.printStackTrace();
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
        } catch (NegativeArraySizeException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        System.out.println("Connection terminated");

    }
}
