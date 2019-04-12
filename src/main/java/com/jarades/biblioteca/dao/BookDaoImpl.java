package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.dao.interfaces.BookDao;
import com.jarades.biblioteca.mockdata.MockData;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Comment;

import java.util.List;
import java.util.Map;

//@Transactional
public class BookDaoImpl implements BookDao {

    MockData mockData = MockData.getInstance();

    @Override
    public void comment(Book book) {

    }

    @Override
    public List<Book> getBooks() {
        return this.mockData.getBooks();
    }

    @Override
    public List<Book> find(Map<String, String> search) {
        return mockData.find(search);
    }

    @Override
    public void register(Book book) {
        this.mockData.register(book);
    }

    @Override
    public List<Comment> getBookComments(long id) {
        return mockData.getBookComments(id);
    }
}
