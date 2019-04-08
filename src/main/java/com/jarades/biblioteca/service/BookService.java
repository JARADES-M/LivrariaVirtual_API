package com.jarades.biblioteca.service;

import com.jarades.biblioteca.resources.Book;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface BookService {
    public void comment(Book book);
    public Book find(Map<String, String> search);
    public Book register(Book book);
}
