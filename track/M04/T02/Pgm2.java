
class Pgm2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("Programe");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());
    }
}
