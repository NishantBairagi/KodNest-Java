
class Practice1 {

    public static void main(String[] args) {
        int[] readings = {18, 21, 20, 24, 19};
        int correntionIndex = 2;
        int correction = 3;
        System.out.println("Reading count: " + readings.length);
        System.out.println("Before correction: " + readings[correntionIndex]);
        readings[correntionIndex] += correction;
        System.out.println("After correction: " + readings[correntionIndex]);
        System.out.println("Last valid index: " + (readings.length - 1));

    }
}
