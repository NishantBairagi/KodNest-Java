
import java.util.Scanner;

class ClosestToTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int diff = Math.abs(ar[0] - tar);
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(ar[i] - tar) < diff) {
                diff = Math.abs(ar[i] - tar);
                j = i;
            } else if (Math.abs(ar[1] - tar) == diff && ar[i] < ar[j]) {
                j = i;
            }
        }
        System.out.println(ar[j]);
        sc.close();
    }
}
