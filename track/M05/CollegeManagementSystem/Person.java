
abstract class Person {

    private int id;
    private String name;
    private int age;

    public Person(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Person id: " + id);
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
    }

    abstract double calculatePayment();

    abstract void displayRole();

}
