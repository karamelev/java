package karamelev.Fundamentals;

import java.util.Scanner;

public class MainTask1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter  number from 1 to 12");
        int number = in.nextInt();
        String[] months = {"January", "February", "March", " April", " May", "June", "July", "August",
                "September", "October", "November", "December"};
        if (number > 0 && number <= months.length) {
            System.out.println(months[number - 1]);
        } else
            throw new IllegalArgumentException("Invalid number");
    }
}
