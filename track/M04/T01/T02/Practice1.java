
import java.util.Scanner;

class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String learnerName = sc.nextLine();
        String courseName = sc.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append("Learner: ");
        builder.append(learnerName);
        builder.append(" | course: ");
        builder.append(courseName);
    }
}
