package com.jarades.biblioteca.resources;

public enum Status {
    PENDING(1),
    SHIPPED(2),
    COMPLETED(3),
    CANCELED(4);

    private final int id;
    private Status(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}