
import java.util.Scanner;

class Practice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();

        int end = scanner.nextInt();

        int evenSum = 0, oddCount = 0;

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {

                evenSum += i;

            } else {

                oddCount++;

            }

        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

        scanner.close();
    }
}
