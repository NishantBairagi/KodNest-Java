
class Parent {

    void disp1() {
        System.out.println("Parent disp1");
    }

    void disp2() {
        System.out.println("Parent disp2");
    }

}

class Child extends Parent {

    @Override
    void disp2() {
        System.out.println("child overriden disp2");
    }

    void disp3() {
        System.out.println("child specialised method");
    }
}

public class Practice4 {

    public static void main(String[] args) {
        Child c = new Child();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}
