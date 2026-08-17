
import java.util.Scanner;

class Pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter array elemnets");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
