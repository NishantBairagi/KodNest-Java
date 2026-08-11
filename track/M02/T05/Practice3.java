
import java.util.Scanner;

class StudentUtility {

// Create the four required methods void showReportTitle(){ System.out.println("Student Performance Report");
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        double avg = (javaScore + sqlScore) / 2.0;
        return avg;

    }

}

class Practice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

// Read input, call methods and display the result
        int id = scanner.nextInt();

        scanner.nextLine();

        String name = scanner.nextLine();

        int javaScore = scanner.nextInt();

        int sqlScore = scanner.nextInt();

        utility.showReportTitle();

        utility.displayStudent(id, name);

        double res = utility.calculatePercentage(javaScore, sqlScore);

        System.out.println("Percentage: " + res);

        if (res >= utility.getPassingPercentage()) {
            System.out.println("Result: PASS");

        } else {

            System.out.println("Result: NEEDS IMPROVEMENT");

        }

        scanner.close();
    }
}
