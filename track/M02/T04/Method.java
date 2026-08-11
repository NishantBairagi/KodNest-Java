
class Method {

    public static void main(String[] args) {
        greet();
        add(2, 3);
    }

    static void greet() {
        System.out.println("Welcome");
    }

    static void add(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }
}
