package com.jarades.biblioteca.dao.interfaces;

import com.jarades.biblioteca.resources.Book;

import java.util.List;

public interface ShoppingCartDao {
    public List<Book> getItems();
    public void addBook(Book book);
    public void removeBook(int id);

}
