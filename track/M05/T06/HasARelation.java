
class OS {

    OS() {
        System.out.println("Os installed successfully");
    }

    void checkOs() {
        System.out.println("OS up to date");
    }
}

class Mobile {

    OS os = new OS();

    public Mobile() {
        System.out.println("Mobile has Os");
    }

}

class HasARelation {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.os.checkOs();

        m = null;
    }
}
