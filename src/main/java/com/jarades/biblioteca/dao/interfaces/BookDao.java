package com.jarades.biblioteca.dao.interfaces;

import com.jarades.biblioteca.resources.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {
    public void comment (Book book);
    public List<Book> getBooks();
    public Book find (Map<String, String> search);
    public void register (Book book);
}
