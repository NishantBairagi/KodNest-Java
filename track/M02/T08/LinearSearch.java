
class LinearSearch {

    public static void arraySearch(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at index: " + i);
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("Element is not present in this Array");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        int j = arr.length - 1;
        for (int a : arr) {
            rev[j] = a;
            j--;
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        arraySearch(arr, key);
        int arr2[] = reverseArray(arr);
        System.out.println("Reverse Array");
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}
