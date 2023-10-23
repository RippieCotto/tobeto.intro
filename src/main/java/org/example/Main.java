package org.example;

import java.time.Clock;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String metin = "Buralar değerlenir";
        String altMetin = "Dutluklara özgürlük";

                //camelCase
        System.out.println(altMetin);
        int vade = 12;
        double kurDun = 18.1;
        double kurBugun = 18.10;
        boolean kurDustuMu = false;
        String okYonu = "";

        if(kurBugun < kurDun){//false
            okYonu = "down.svg";
            System.out.println(okYonu);}

            else if(kurBugun > kurDun){
                okYonu = "up.svg";
                System.out.println(okYonu);
            }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
            //array
        String[] krediler = {"Hızlı Kredi", "Mutlu Kredi", "Haklı Kredi", "Pasaklı Kredi"};

        for (int i = 0; i< krediler.length; i++){
            System.out.println(krediler[i]);
        }

    }
}