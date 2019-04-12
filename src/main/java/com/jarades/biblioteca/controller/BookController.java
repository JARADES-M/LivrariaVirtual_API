package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.service.Interfaces.BookService;
import com.jarades.biblioteca.service.BookServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Api(value = "Rest API: Biblioteca", tags = {"Livros"}, description = "Operações Rest")
@RestController
@RequestMapping(value = {"/v1/books"})
public class BookController {

    BookService bookService = new BookServiceImpl();

    @ApiOperation("Retorna os livros pesquisa ou todos os registrados")
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks(@RequestParam(required = false) String bookId,
                                @RequestParam(required = false) String title,
                                @RequestParam(required = false) String year){

        Map<String, String> search = new HashMap<>();
        if(bookId != null)
            search.put("bookId", bookId);

        if(title != null)
            search.put("title", title);

        if(year != null)
            search.put("year", year);

        if (search.size() > 0)
            return bookService.find(search);

        return bookService.getBooks();
    }

    @ApiOperation("Registra um Livro")
    @RequestMapping(method = RequestMethod.POST)
    public void setBook(@RequestBody Book book) {
        bookService.register(book);
    }

    @ApiOperation("Retorna os comentários de um Livro")
    @RequestMapping(value = {"/{bookId}/comments"}, method = RequestMethod.GET)
    public List<Comment> getBookComments(@PathVariable(value = "bookId") int id){
        return bookService.getBookComments(id);
    }

}
