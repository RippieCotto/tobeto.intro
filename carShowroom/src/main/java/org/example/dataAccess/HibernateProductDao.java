package org.example.dataAccess;

import org.example.entities.Automobile;

public class HibernateProductDao implements AutomobileDao {
    public void add(Automobile automobile){
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
