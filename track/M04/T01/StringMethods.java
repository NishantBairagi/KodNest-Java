
class StringMethods {

    public static void main(String[] args) {
        String s = "KodNest Technologies";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(3));
        System.out.println(s.startsWith("Kod"));
        System.out.println(s.startsWith("Nest"));
        System.out.println(s.contains("Nest"));
        System.out.println(s.endsWith("gies"));
        System.out.println(s.indexOf('N'));//-1
        System.out.println(s.indexOf('Z'));//-1
        System.out.println(s.length());
        System.out.println(s.replace('e', 'p'));
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 14));

    }
}
