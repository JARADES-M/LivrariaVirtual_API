package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.service.Interfaces.BookService;
import com.jarades.biblioteca.service.BookServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Rest API: Biblioteca", tags = {"Ações para Livro"}, description = "Operações Rest")
@RestController
public class BookController {

    BookService bookService = new BookServiceImpl();
    @ApiOperation("Retorna os livros disponíveis")
    @RequestMapping(value = "/v1/books", method = RequestMethod.GET)
    public List<Book> getBooks(@RequestParam("title") String title){
        return bookService.getBooks();
    }

    @ApiOperation("Registra um Livro")
    @RequestMapping(value = "/v1/books", method = RequestMethod.POST)
    public void setBook(@RequestBody Book book) {
        bookService.register(book);
    }
}
