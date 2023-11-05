package org.example;

import org.example.business.AutomobileManager;
import org.example.entities.Automobile;

public class Main {
    public static void main(String[] args) throws Exception {

        Automobile automobile1 = new Automobile(1,"Peugeot", "2008", 2023, 0, 1338000);
        Automobile automobile2 = new Automobile(2,"BMW","320i", 2020, 1400,1200000);
        Automobile automobile3 = new Automobile(3,"Hyundai", "Bayon", 2018, 80000, 750000);

        AutomobileManager automobileManager = new AutomobileManager();
        automobileManager.add(automobile1);
        automobileManager.add(automobile2);
        automobileManager.add(automobile3);
    }
}