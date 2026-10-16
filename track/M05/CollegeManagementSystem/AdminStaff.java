
class AdminStaff extends Person {

    private String department;
    private double salary;

    public AdminStaff(int age, int id, String name, String department, double salary) {
        super(age, id, name);
        this.department = department;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Admin Staff");
    }

}
