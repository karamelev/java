package karamelev.Fundamentals;


import java.util.Arrays;
import java.util.Scanner;

public class MainTask2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the matrix");
        int n = in.nextInt();
        System.out.println("Please enter column number");
        int k = in.nextInt();
        System.out.println("Please enter range of values");
        int M = in.nextInt();


        int[][] array = new int[n][n];
//                {(int) (Math.random() * M - 1)},
//                {(int) (Math.random() * -M - 1)}

        for (int i = 0; i < n; i++) { // заполнение массива
            for (int j = 0; j < n; j++) {
                int randomNumber = (int) (Math.random() * (2 * M)) - M;
                array[i][j] = randomNumber;
            }
        }

        for (int i = 0; i < n; i++) { //вывод массива
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
            System.out.print("\n");
        }

        boolean isSorted = false;// переменная флаг
        while (!isSorted) {// пока массив не отсортирован
            isSorted = true;// массив отсортирован
            for (int i = 0; i < n - 1; i++) {
                if (array[i][k] > array[i + 1][k]) {
                    isSorted = false;// если передвигаем хотя бы одну строку то предполагаем что весь массив не отсортирован

                    for (int j = 0; j < n; j++) { // меняем строки местами (сортируем массив
                        int buf = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = buf;
                    }
                    System.out.println("перенос строки");// вывод
                    for (int z = 0; z < n; z++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(array[z][j]);
                            System.out.print(", ");
                        }
                        System.out.print("\n");
                    }
                }
            }

            for (int i = 0; i < n; i++) { // вывод отсортированного массива
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j]);
                    System.out.print(", ");
                }
                System.out.print("\n");
            }
        }

    }
}

