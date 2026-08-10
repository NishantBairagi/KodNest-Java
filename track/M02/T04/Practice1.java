
class student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Practice1 {

    public static void main(String[] args) {
        student s1 = new student();
        s1.roll = 122;
        s1.name = "Nishant";
        s1.height = 5.10;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(String.format("%.2f", s1.height));

        s1.run();
        s1.sleep();
    }
}
