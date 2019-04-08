package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.resources.Book;

import java.util.Map;

public interface BookDao {
    public void comment (Book book);
    public Book find (Map<String, String> search);
    public Book register (Book book);
}
