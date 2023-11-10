package org.example.sartBloklari;

public class sartBloklari {
    public static void main(String[] args) {
        int not = 85;
        //50 ve üzeri geçer
        //40 - 49 Bütünleme
        //0- 39 Kaldı
        if (not >= 50) {
            System.out.println("Geçti");
        } else if (not >=40 && not<50) {
            System.out.println("Bütünleme");

        }
        else System.out.println("Kaldı");
    }
}
