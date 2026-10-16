
class Professor extends Person {

    private String subject;
    private double salary;

    public Professor(int age, int id, String name, String subject, double salary) {
        super(age, id, name);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Professor");
    }

}
