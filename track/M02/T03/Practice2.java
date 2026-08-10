
import java.util.Scanner;

class Practice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int practiceDays = scanner.nextInt();
        int totalProblemsSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {

            int problemsSolvedPerDay = scanner.nextInt();
            totalProblemsSolved += problemsSolvedPerDay;

        }

        String status = "";

        if (totalProblemsSolved >= 20) {
            status = "Strong progress";

        } else if (totalProblemsSolved >= 10) {
            status = "Keep improving";

        } else {

            status = "Needs more practice";

        }

        System.out.println("Total solved: " + totalProblemsSolved);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
