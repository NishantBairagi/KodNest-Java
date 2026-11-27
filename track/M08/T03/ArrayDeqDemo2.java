
import java.util.ArrayDeque;

public class ArrayDeqDemo2 {

    public static void main(String[] args) {

        ArrayDeque ad = new ArrayDeque();

        ad.add(10);

        ad.add(20);

        ad.add(30);

        ad.add(40);

        ad.add(50);

        while (!ad.isEmpty()) {
            System.out.println(ad.remove());
        }

        // System.out.println(ad);
        // System.out.println(ad.poll());// 10
        // System.out.println(ad);
        // System.out.println(ad.peek()); // 20
        // System.out.println(ad);
        // System.out.println(ad.peekLast());//50
        // System.out.println(ad);
        // ad.offer(99);
        // System.out.println(ad);
    }

}
