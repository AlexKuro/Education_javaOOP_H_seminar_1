package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> basket;

    public Basket() {

    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Корзина: \n" + "Товары: " + basket;
    }
}
