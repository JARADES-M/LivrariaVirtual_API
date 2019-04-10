package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.mockdata.MockData;
import com.jarades.biblioteca.resources.Book;

import java.util.List;
import java.util.Map;

//@Transactional
public class BookDaoImpl implements BookDao {

    @Override
    public void comment(Book book) {

    }

    @Override
    public List<Book> getBooks() {
        return MockData.getBooks();
    }

    @Override
    public Book find(Map<String, String> search) {
        return null;
    }

    @Override
    public void register(Book book) {
        MockData.register(book);
    }
}
