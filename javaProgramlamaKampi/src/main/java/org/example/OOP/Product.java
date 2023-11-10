package org.example.OOP;

public class Product {
private String name;
private String description;
private double price;

public String getName(){return name;} //değer okuduğu için return
    public void setName(String name){ //Değer dönmeyecek biz değer vereceğiz. bu yuzden return yok ve void
    this.name = name;

}
}
