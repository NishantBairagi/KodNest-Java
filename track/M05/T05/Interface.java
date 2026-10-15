
interface Shape {

    void input();

    void display();
}

class Square implements Shape {

    public void input() {
        System.out.println("INPUT");
    }

    public void display() {
        System.out.println("Display");
    }
}

public class Interface {

    public static void main(String[] args) {
        Shape s = new Square();
        s.input();
        s.display();
    }
}
