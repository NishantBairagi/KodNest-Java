
import java.util.ArrayDeque;

public class ArrayDeqStackDemo {

    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();

        ad.push(10);

        ad.push(20);

        ad.push(30);

        ad.push(40);

        ad.push(50);

        System.out.println(ad);// 10 20 30 40 50

        System.out.println(ad.pop());// 50

        System.out.println(ad.pop());
    }
}
