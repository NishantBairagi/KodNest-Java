
class Method {

    public static void main(String[] args) {
        greet();
        add(2, 3);
        int res = add2();
        System.out.println(res);
    }

    static void greet() {
        System.out.println("Welcome");
    }

    static void add(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }

    static int add2() {
        int a = 10;
        int b = 20;
        return a + b;
    }
}
