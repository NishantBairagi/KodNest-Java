
class Practice7 {

    public static void main(String[] args) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;
        int[] snapshot = new int[readings.length];
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }
        if (updateIndex >= 0 && updateIndex < readings.length) {
            readings[updateIndex] = newValue;
        }
        System.out.print("Snapshot: ");
        for (int elem : snapshot) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.print("Readings: ");
        for (int elem : readings) {
            System.out.print(elem + " ");
        }
    }
}
