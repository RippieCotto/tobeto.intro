package org.example.case2Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");

        int number = input.nextInt();
        input.close();

        double[] fiboSeries = fiboNumber(number);
        System.out.println("Fibonacci Sayıları: ");
        for (int i = 0; i < number; i++) {
            System.out.println(fiboSeries[i] + " ");
        }


    /*    Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");

        int number = input.nextInt();
        input.close();

        double n, number1 = 0, number2 = 0, result = 1;

        System.out.println("Fibonacci Sayıları :");

        for(int i = 1; i <= number; i++)
        {
            number1 = number2;
            number2 = result;
            result = number1 + number2;
            System.out.println(number1+" ");
        }*/
    }

    public static double[] fiboNumber(int number) {
        double n, number1 = 0, number2 = 1, result;

        double[] fiboSeries = new double[number];

        for (int i = 0; i < number; i++) {
            fiboSeries[i] = number1;
            result = number1 + number2;
            number1 = number2;
            number2 = result;


        }


        return fiboSeries;
    }

}
