
import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
