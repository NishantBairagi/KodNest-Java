
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
    }
}

class StudentApplication {

    public static void main(String[] args) {
        Student s = new Student();
        s.input("Nishant", 22, 5.9);
        s.display();
    }
}
