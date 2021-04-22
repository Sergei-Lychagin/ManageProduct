package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }


    public String getManufacturer() {
        return manufacturer;
    }
    public boolean matches(String manufacturer ) {
        if (super.matches(manufacturer)) {
            return true;
        }
        return getManufacturer().equalsIgnoreCase(manufacturer);
    }
}