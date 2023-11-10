package org.example;

import java.util.Collections;

import org.example.OOP.*;

import java.util.ArrayList;

//SOLID => Yazılımcının 5 temel ilkesi
//O: Yeni bir ürün gelirse mevcut kodlarım değişmesin
public class Main {
    public static <CreditManager> void main(String[] args) {
//        int[] sayilar = new int[]{1,2,3};
//
//        Product product1 = new Product();
//        product1.setName("Laptop");
//
//        Product product2 = new Product();
//        product2.setName("Mouse");
//
//        Product[] urunler = new Product[]{product1, product2};
//
//        for (int i=0; i< urunler.length; i++){
//            System.out.println(urunler[i].getName());
//        };
//        CreditManager creditManager = new CreditManager();
//
//            creditManager.add();
//            creditManager.calculate();
//
//        MortgageManager mortgageManager = new MortgageManager();
//        mortgageManager.add();
//        mortgageManager.calculate();

        ArrayList<String> sehirler = new ArrayList<>();

        ArrayList<CreditManager> credits = new ArrayList<CreditManager>();

        credits.add((CreditManager) new MortgageManager());
        credits.add((CreditManager) new VeichleCredit());
        credits.add((CreditManager) new OfficerManager());

        for (CreditManager credit : credits){
            credit.calculate();


        }
    }

}






