
import java.util.Scanner;

class Parent {

    private String name;

    Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Child extends Parent {

    private int marks;

    Child(String name, int marks) {
        super(name);
        this.marks = marks;
    }

    void display() {
        System.out.println(getName() + " " + marks);
    }
}

public class Practice03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int marks = scanner.nextInt();
        Child c = new Child(name, marks);
        c.display();
        scanner.close();
    }
}
