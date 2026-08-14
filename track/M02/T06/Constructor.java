
class Stud {

    String name;
    int age;
    double height;

    public Stud(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

}

public class Constructor {

    public static void main(String[] args) {
        Stud s1 = new Stud("Nishant", 22, 5.9);
        s1.display();
    }
}
