
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    public MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    public MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + " Price: " + price);
    }
}

class Practice5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String planName = sc.nextLine();
        int price = sc.nextInt();
        MobilePlan mp = new MobilePlan();
        MobilePlan mp2 = new MobilePlan(planName, price);
        mp.display();
        mp2.display();
    }
}
