
import java.util.Scanner;

public class countGreaterThanAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            sum += ar[i];
        }
        double avg = (double) sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] > avg) {
                count++;
            }
        }
        System.out.println(count);
    }
}
