
import java.util.Scanner;

class Practice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int practiceDays = scanner.nextInt();
        int totalSolvedProblems = 0;
        for (int i = 1; i <= practiceDays; i++) {
            int problemsSolved = scanner.nextInt();
            totalSolvedProblems += problemsSolved;
        }

        double dailyAvg = totalSolvedProblems / practiceDays;
        String status = dailyAvg >= 5.0 ? "Consistent" : "Needs consistency";
        System.out.println("Learner:" + fullName);
        System.out.println("Total solved: " + totalSolvedProblems);
        System.out.println("Daily average: " + dailyAvg);
        System.out.println("Status: " + status);
    }
}
