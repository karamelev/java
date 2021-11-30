package karamelev.Fundamentals;

import java.util.Scanner;

public class MainTask1_4 {
    public static void main(String[] args){

       int sum = 0;
       int multiply = 1;
        for (int i = 0; i < args.length; i++) {
            sum+= Integer.parseInt(args[i]);
            multiply*=Integer.parseInt(args[i]);
        }
        System.out.println("summa: "+ sum);
        System.out.println("multiplying: "+multiply );
    }
}
