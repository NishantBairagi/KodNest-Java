
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
        int b[] = new int[a.length];
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[j] = a[i];
            j--;
        }
        int rev[] = b;
        System.out.println("Reversed array elements");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("Reference Array elements");
        for (int i = 0; i < rev.length; i++) {
            System.out.println(rev[i]);
        }
    }

}
