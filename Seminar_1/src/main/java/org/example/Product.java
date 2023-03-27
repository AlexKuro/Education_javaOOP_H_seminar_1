package org.example;

public class Product {
    //    имя, цена, рейтинг
    private String name;

    private Integer price;
    private Double rating;

    public Product(){

    }

    public Product(String name, Integer price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Товар:" + " '" + name + '\'' +
                ", цена = " + price +
                ", рейтинг = " + rating;
    }
}
