package org.example;

import java.util.ArrayList;

public class Category {

    private String name;
    private ArrayList<Product> products;

    public Category() {

    }
    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
//    public void printArray(ArrayList<Product> products){
//        for (int i = 0; i < products.size(); i++) {
//            System.out.println(products.get(i));
//        }
//    }

    @Override
    public String toString() {
        return "Категория товара:" + " '" + name + '\'' + products;
    }
}
