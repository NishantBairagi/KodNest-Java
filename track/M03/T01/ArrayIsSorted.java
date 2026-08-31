
import java.util.Scanner;

class ArrayIsSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int sort = 1;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i + 1] < ar[i]) {
                sort = 0;
                break;
            }
        }
        System.out.println(sort);
        sc.close();
    }
}
