
import java.util.Scanner;

class Array3D {

    public static void main(String[] args) {
        int[][][] ar = new int[3][3][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                for (int k = 0; k < ar[i][j].length; k++) {
                    ar[i][j][k] = sc.nextInt();
                }

            }

        }
        sc.close();
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                for (int k = 0; k < ar[i][j].length; k++) {
                    System.out.print(ar[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
