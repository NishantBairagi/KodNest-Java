
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    public FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    public FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + " Quantity: " + quantity);
    }

}

class Practice4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        int quantity = sc.nextInt();
        FoodOrder f1 = new FoodOrder(item);
        FoodOrder f2 = new FoodOrder(item, quantity);
        f1.display();
        f2.display();
    }
}
