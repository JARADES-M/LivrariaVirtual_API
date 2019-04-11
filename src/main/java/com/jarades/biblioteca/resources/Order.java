package com.jarades.biblioteca.resources;

public class Order {
    private long id;
    private Book book;
    private Status status;

    public Order() {
    }

    public Order(long id, Book book, Status status) {
        this.id = id;
        this.book = book;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
