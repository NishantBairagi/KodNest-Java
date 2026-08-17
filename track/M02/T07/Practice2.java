
class Practice2 {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }
        int[] liveView = original;
        if (updateIndex >= 0 && updateIndex < original.length) {
            liveView[updateIndex] = updatedValue;
        }
        System.out.print("Original: ");
        for (int x : original) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Snapshot: ");
        for (int s : snapshot) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Same object: " + (original == liveView));
        System.out.print("Requested Value: ");
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println(original[requestedIndex]);
        } else {
            System.out.println("Invalid index");
        }

    }
}
