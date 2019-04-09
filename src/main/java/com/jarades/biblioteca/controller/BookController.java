package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.service.BookService;
import com.jarades.biblioteca.service.BookServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    BookService bookService = new BookServiceImpl();

    @RequestMapping(value = "/v1/books", method = RequestMethod.GET)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
}
