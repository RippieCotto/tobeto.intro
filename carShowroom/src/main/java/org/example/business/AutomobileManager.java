package org.example.business;

import org.example.dataAccess.AutomobileDao;
import org.example.entities.Automobile;

import java.util.List;

public class AutomobileManager {
    private AutomobileDao automobileDao;


    public AutomobileManager() {
        this.automobileDao = automobileDao;
    }

    public void add(Automobile automobile) throws Exception {
        //İş Kuralları

        if(automobile.getPrice()<100){
            throw new Exception("Aracın fiyatı 100 den küçük olamaz!");
                            }

        if(automobile.getYear()>2023){
            throw new Exception("Aracın yılı 2023 ten büyük olamaz");
        }

        AutomobileDao.add(automobile);



    }
}
