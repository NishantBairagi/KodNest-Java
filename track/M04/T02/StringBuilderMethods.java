
class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programe");
        System.out.println(sb);
        sb.insert(0, "Python");
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
