package com.jarades.biblioteca.resources;

public class Comment {

    private long id;
    private long bookId;
    private User user;
    private String comment;

    public Comment(long id, long bookId, User user, String comment) {
        this.id = id;
        this.bookId = bookId;
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

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}