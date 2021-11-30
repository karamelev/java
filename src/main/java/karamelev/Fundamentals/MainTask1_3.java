package karamelev.Fundamentals;

import java.util.Scanner;

public class MainTask1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter the size of the array");

        int[] numbers = new int[in.nextInt()];

        System.out.println("Please, enter amount of digits");
        int amount = in.nextInt();


        for (int i = 1; i <= numbers.length; i++) {
            numbers[i-1] = i;
        }

        for (int i = 0; i < amount; i++) {
            System.out.print(numbers[((int) (Math.random() * (numbers.length - 1)))] + " ");
        }

        for (int i = 0; i < amount; i++) {

            System.out.println(numbers[((int) (Math.random() * (numbers.length - 1)))]);
        }
    }
}
