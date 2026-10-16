
public class CollegeManagement {

    public static void main(String[] args) {
        Student s1 = new Student(20, 101, "Rahul", "Java", 25000);
        Student s2 = new Student(21, 102, "Priya", "Python", 30000);

        Professor p1 = new Professor(40, 201, "Mahesh", "Java", 60000);
        Professor p2 = new Professor(35, 202, "Kavya", "SQL", 55000);

        AdminStaff a = new AdminStaff(32, 301, "Ramesh", "Accounts", 35000);

        Person[] all = new Person[5];

        all[0] = s1;
        all[1] = s2;
        all[2] = p1;
        all[3] = p2;
        all[4] = a;
        Person p;
        double totalAmount = 0;
        for (int i = 0; i < 5; i++) {
            p = all[i];
            System.out.print("Details of ");
            p.displayRole();
            p.showDetails();
            System.out.println("Payment: " + p.calculatePayment());

            totalAmount += p.calculatePayment();
        }

        System.out.println("Total payment amount is " + totalAmount);

    }
}
