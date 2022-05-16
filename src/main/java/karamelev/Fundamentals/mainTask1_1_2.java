package karamelev.Fundamentals;

import java.util.Scanner;

public class mainTask1_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers:");
        int size = scanner.nextInt();

        Integer [] array = new Integer[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение" + i);
            array [i] = scanner.nextInt();
        }
        int max = array [0].toString().length();
        int min = array [0].toString().length();
        for (int i = 0; i <array.length ; i++) {
            max = Math.max(max, array [i].toString().length());
            min = Math.min(min, array[i].toString().length());
          }
        if (max != min)
            System.out.println("минимальная длина: " + min);
                for (Integer elem: array) {
                    if (elem.toString().length() == min)
                        System.out.print(elem + ",");
                }
            System.out.println("максимальная длинна: " + max);
                 for (Integer elem1: array) {
                      if ( elem1.toString().length() == max)
                          System.out.print(elem1 + ",");
            }
        }
    }


