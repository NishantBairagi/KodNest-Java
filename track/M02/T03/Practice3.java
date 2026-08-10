
import java.util.Scanner;

class Practice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = scanner.nextDouble();

        double rent = scanner.nextDouble();

        double food = scanner.nextDouble();

        double travel = scanner.nextDouble();

        double totalExpence = rent + food + travel;

        double remainingAmount = income - totalExpence;

        String status = remainingAmount >= 0 ? "Within budget" : "Over budget";

        System.out.println("Total expense: " + totalExpence);

        System.out.println("Remaining: " + remainingAmount);

        System.out.println("Status: " + status);

        scanner.close();
    }
}
