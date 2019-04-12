package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.interfaces.BookDao;
import com.jarades.biblioteca.dao.BookDaoImpl;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.service.Interfaces.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    //@Autowired
    BookDao bookDao = new BookDaoImpl();

    @Override
    public void comment(Book book) {
        bookDao.comment(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookDao.getBooks();
    }

    @Override
    public List<Book> find(Map<String, String> search) {
        return bookDao.find(search);
    }

    @Override
    public void register(Book book) {
        this.bookDao.register(book);
    }

    @Override
    public List<Comment> getBookComments(long id) {
        return bookDao.getBookComments(id);
    }
}
