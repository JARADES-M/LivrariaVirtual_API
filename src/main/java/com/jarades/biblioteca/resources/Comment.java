package com.jarades.biblioteca.resources;

public class Comment {

    private long id;
    private Book book;
    private User user;
    private String comment;

    public Comment(long id, Book book, User user, String comment) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.comment = comment;
    }

    public Comment(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}