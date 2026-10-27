
class OS {

    OS() {
        System.out.println("Os installed successfully");
    }

    void checkOs() {
        System.out.println("OS up to date");
    }
}

class Charger {

    public Charger() {
        System.out.println("Charger created ");
    }

    void getCharger() {
        System.out.println("Charger used for charging");
    }

}

class Mobile {

    OS os = new OS();

    public Mobile() {
        System.out.println("Mobile has Os");
    }

    void hasA(Charger ch) {
        System.out.println("Charger aquired");
    }

}

class HasARelation {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.os.checkOs();
        Charger ch = new Charger();
        m.hasA(ch);

        m = null;
    }
}
