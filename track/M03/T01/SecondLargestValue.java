
import java.util.Scanner;

class SecondLargestValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        int largest = ar[0];
        int second = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (ar[i] > largest) {
                second = largest;
                largest = ar[i];
            } else if (ar[i] > second && ar[i] != largest) {
                second = ar[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(second);
        }
    }
}
