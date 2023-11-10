package org.example.donguler;

public class donguler {
    public static void main(String[] args) {
        //Döngüler; benzer işleri tekrar tekrar yaptırmak için

        String urun = "Laptop";
        for (int i=1;i<10; i++){ //i => SAYAÇ
            System.out.println(urun + i);
        }

        for (int i =0 ; i<=10; i+=2){
            System.out.println(i);
        }

        System.out.println("*******************************");
        int sayi =10;
        while (sayi<=100){
            System.out.println(sayi);
            sayi = sayi+10;
        }
        System.out.println("************************************");
        int sayi2 = 10;
        do{
            System.out.println(sayi2);
            sayi2 = sayi2 + 10;
        }while(sayi2>100);
    }
}
