package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.BookDaoImpl;
import com.jarades.biblioteca.resources.Book;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    //@Autowired
    BookDaoImpl bookDaoImpl;

    @Override
    public void comment(Book book) {

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
