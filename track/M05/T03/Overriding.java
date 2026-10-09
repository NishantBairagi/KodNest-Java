
class Developer {

    void work() {
        System.out.println("Developer is working");
    }

    void project() {
        System.out.println("Developers project");
    }
}

class JavaDeveloper extends Developer {

    void work() {
        System.out.println("Java Developer is working");
    }

    void project() {
        System.out.println("Java Developers project");
    }
}

class PythonDeveloper extends Developer {

    void work() {
        System.out.println("Python Developer is working");
    }

    void project() {
        System.out.println("Python Developers project");
    }
}

public class Overriding {

    public static void main(String[] args) {
        accessMethods(new JavaDeveloper());
        accessMethods(new PythonDeveloper());
    }

    public static void accessMethods(Developer dev) {
        dev.work();
        dev.project();
    }
}
