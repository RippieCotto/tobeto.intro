package org.example.entities;

public class Automobile {
    private int id;
    private String brand;
    private String model;
    private int year;
    private int km;
    private int price;

    public Automobile() {
    }

    public Automobile(int id, String brand, String model, int year, int km, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.km = km;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
