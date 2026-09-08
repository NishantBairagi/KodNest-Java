
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

        String s1 = " Java  ";
        System.out.println(s1.trim());
        System.out.println(s1.stripLeading());//trim begining spaces
        System.out.println(s1.stripTrailing());//trim last spaces

        String s2 = "Raja";
        System.out.println(s2.isEmpty());//false
        System.out.println(s2.isBlank());//false

        String s3 = "";
        System.out.println(s3.isEmpty());//true
        System.out.println(s3.isBlank());//true

        String s4 = " ";
        System.out.println(s4.isEmpty());//false
        System.out.println(s4.isBlank());//true
    }
}
