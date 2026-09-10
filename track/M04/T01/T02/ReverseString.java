
class ReverseString {

    public static void main(String[] args) {
        String text = "Java";
        StringBuilder res = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            res.append(text.charAt(i));
        }
        System.out.println("Reversed: " + res);
    }
}
