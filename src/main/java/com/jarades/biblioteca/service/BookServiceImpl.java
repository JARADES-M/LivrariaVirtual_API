package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.BookDao;
import com.jarades.biblioteca.dao.BookDaoImpl;
import com.jarades.biblioteca.resources.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    //@Autowired
    BookDao bookDao = new BookDaoImpl();

    @Override
    public void comment(Book book) {

    }

    @Override
    public List<Book> getBooks() {
        return bookDao.getBooks();
    }

    @Override
    public Book find(Map<String, String> search) {
        return null;
    }

    @Override
    public Book register(Book book) {
        return null;
    }
}
