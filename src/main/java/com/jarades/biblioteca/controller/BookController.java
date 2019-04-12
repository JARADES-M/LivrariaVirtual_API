package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.service.Interfaces.BookService;
import com.jarades.biblioteca.service.BookServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Rest API: Biblioteca", tags = {"Livro"}, description = "Operações Rest")
@RestController
@RequestMapping(value = {"/v1/books", "/v1/livros"})
public class BookController {

    BookService bookService = new BookServiceImpl();

    @ApiOperation("Retorna os livros disponíveis")
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @ApiOperation("Registra um Livro")
    @RequestMapping(method = RequestMethod.POST)
    public void setBook(@RequestBody Book book) {
        bookService.register(book);
    }

    @ApiOperation("Retorna os comentários de um Livro")
    @RequestMapping(value = {"/{bookId}/comments", "/{bookId}/comentarios"}, method = RequestMethod.GET)
    public List<Comment> getBookComments(@PathVariable(value = "bookId") int id){
        return bookService.getBookComments(id);
    }

}
