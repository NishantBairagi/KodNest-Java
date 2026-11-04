
class Checked {

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);//checked at compile time by compiler and forces to handle this 
        } catch (InterruptedException ex) {
            System.getLogger(Checked.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
