
import java.util.Scanner;

class FirstLastOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int el = sc.nextInt();
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (ar[i] == el) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first + " " + last);
    }
}
