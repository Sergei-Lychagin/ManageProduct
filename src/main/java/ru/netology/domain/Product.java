package ru.netology.domain;

public class Product {
    private int id;
    private String name;
    private int price;

    public int getId() {

        return id;
    }


    public String getName() {
        return name;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(String name) {
        return (getName().equalsIgnoreCase(name));
    }
}
