
import java.util.Scanner;

final class Student {

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

}

public class FinalKeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();

        Student s = new Student(id, name);
        System.out.println(s.getId());
        System.out.println(s.getName());

    }
}
