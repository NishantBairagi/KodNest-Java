
class Pgm1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0
        sb.append("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("is a programming language");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
