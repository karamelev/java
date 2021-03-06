package karamelev.Fundamentals;

import java.util.Scanner;

public class MainTask2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the matrix");
        int n = in.nextInt();
        System.out.println("Please enter column number");
        int k = in.nextInt();
        System.out.println("Please enter range of values");
        int M = in.nextInt();


        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) { // заполнение массива
            for (int j = 0; j < n; j++) {
                int randomNumber = (int) (Math.random() * (2 * M)) - M;
                array[i][j] = randomNumber;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
            System.out.print("\n");
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (array[k][j] > array[k][j+1]) {
                    isSorted = false;

                    for (int i = 0; i < n; i++) {
                        int buf = array[i][j];
                        array[i][j] = array[i][j+1];
                        array[i][j+1] = buf;
                    }
                    System.out.println("перенос столбца");
                    for (int z = 0; z < n; z++) {
                        for (int t = 0; t < n; t++) {
                            System.out.print(array[z][t]);
                            System.out.print(", ");
                        }
                        System.out.print("\n");
                    }
                }
            }
            System.out.print("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j]);
                    System.out.print(", ");
                }
                System.out.print("\n");
            }
        }

    }
}
