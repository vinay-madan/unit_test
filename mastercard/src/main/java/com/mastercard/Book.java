package com.mastercard;

public class Book {

    private long id;
    private  String title;

    public Book() {
    }

    public Book(long id, String title) {
        this.id = id;
        this.title = title;

    }

    public String getTitle() {

       return title;
    }

    public long getId() {

        return id;
    }
}
