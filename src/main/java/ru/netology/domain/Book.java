package ru.netology.domain;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }
    public boolean matches(String author ) {
        if (super.matches(author)) {
            return true;
        }
        return getAuthor().equalsIgnoreCase(author);
    }
}