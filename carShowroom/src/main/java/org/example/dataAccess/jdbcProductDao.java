package org.example.dataAccess;

import org.example.entities.Automobile;

public class jdbcProductDao implements AutomobileDao{
    //DB erişimi için --- SQL
    public void add(Automobile automobile){
        System.out.println("JDBC ile veritabanına eklendi.");
    }

}
