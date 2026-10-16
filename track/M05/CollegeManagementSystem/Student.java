
class Student extends Person {

    private String course;
    private double fee;

    public Student(int age, int id, String name, String course, double fee) {
        super(age, id, name);
        this.course = course;
        this.fee = fee;
    }

    @Override
    double calculatePayment() {
        return fee;
    }

    @Override
    void displayRole() {
        System.out.println("Student");
    }

}
