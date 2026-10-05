
class Parent {

    Parent() {
        super();
        System.out.println("Inside parent constructor");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Inside Child constructor");
    }
}

public class ConstructorChaining2 {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
