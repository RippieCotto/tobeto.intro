package org.example.methods;

public class metotlar {

        public static void main(String[] args) {
            System.out.println("Merhaba");
            mesajVer("Engin");
            mesajVer("Zengin");
            hesapla();
            hesapla();

            System.out.println(topla(6, 3));
            System.out.println(toplananIkıSayininYuzdeOnu(10, 90));
            System.out.println(toplananIkıSayininYuzdeOnu(55, 99));
            toplananIkıSayininYuzdeOnu(45, 22);

            topla(6, 3);
        }

        public static void mesajVer(String isim) {
            System.out.println("Merhaba " + isim);
        }

        public static void hesapla() {
            System.out.println("Hesaplandı");
        }

        public static int topla(int sayi1, int sayi2) {
            int toplam = sayi1 + sayi2;
            return toplam;

        }

        //toplanan iki sayının %10'unu bul
        // bir metodda bir fonksiyon çalışır => CLEAN CODE
        //Bir metodda birden fazla fonksiyon kullanırsan kod spagettiye gider

        public static double toplananIkıSayininYuzdeOnu(int sayi1, int sayi2) {

            int toplam = topla(sayi1, sayi2);
            double sonuc = toplam * 0.1;
            System.out.println("Sonuç " + sonuc);
            return sonuc;
        }

        public static double krediHesapla(double krediMiktari) {
            //hesaplar yapılır
            return 125000;
        }
    }

