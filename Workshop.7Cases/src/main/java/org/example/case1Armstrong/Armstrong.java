package org.example.case1Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = input.nextInt(); //int 25478 list[] = {2, 5, 4, 7, 8}
        input.close();

        //int number = 407;

        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {  //347
            remainder = originalNumber % 10;
            result += Math.pow(remainder,3); // 3. kuvvetini alıyoruz, çünkü Armstrong sayısı 3 basamaklı ise
            originalNumber /= 10; //Tekrar bakılacak Float olursa
        }

        if (result == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }

}
