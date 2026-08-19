
import java.util.Scanner;

class Jagged2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][];
        matrix[0] = new int[4];
        matrix[1] = new int[3];
        matrix[2] = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        sc.close();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
