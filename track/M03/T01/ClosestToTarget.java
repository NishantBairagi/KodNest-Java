
import java.util.Scanner;

class ClosestToTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int closest = ar[0];
        int minDiff = Math.abs(ar[0] - target);

        for (int i = 1; i < n; i++) {

            int diff = Math.abs(ar[i] - target);

            if (diff < minDiff
                    || (diff == minDiff && ar[i] < closest)) {

                minDiff = diff;
                closest = ar[i];
            }
        }

        System.out.println(closest);
        sc.close();
    }
}
