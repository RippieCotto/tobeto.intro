package org.example.diziler;

public class diziler {
    public static void main(String[] args) {
        //Diziler
        String [] sehirler1 = new String[]{"Ankara","İstanbul","İzmir"};
        for(String sehir : sehirler1){
            System.out.println(sehir);
        }

        for (int i =0;i<3;i++){
            System.out.println(sehirler1[i]);
        }


        String[] sehirler = new String[]{"Ankara", "İstanbul", "İzmir"};


        String[] sehirler2 = new String[]{"Antep", "Diyarbakır","Bursa"};

        sehirler = sehirler2;
        sehirler[0] = "Adana";


        System.out.println(sehirler2[0]);

        int sayi1 =10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println(sayi1);

        //Value Typse : bool, int, double
        //Reference Types : array, class, abstract, interface

    }
}
