package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.service.Interfaces.ShoppingCartService;
import com.jarades.biblioteca.service.ShoppingCartServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Shopping Cart Controller", tags = "Carrinho de Compras", description = "Controle do Carrinho de Compras")
@RestController
@RequestMapping(value = {"v1/cart"})
public class ShoppingCartController {

    ShoppingCartService shoppingCartService = new ShoppingCartServiceImpl();

    @ApiOperation(value = "Lista o items do Carrinho de Compras")
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> listItems() {
        return shoppingCartService.getItems();
    }

    @ApiOperation(value = "Adicionar um Livro ao Carrinho")
    @RequestMapping(method = RequestMethod.POST)
    public void addItem(@RequestBody Book book){
        shoppingCartService.addBook(book);
    }

    @ApiOperation(value = "Remove um livro do Carrinho")
    @RequestMapping(value = "/{bookId}", method = RequestMethod.DELETE)
    public void removeItem(@PathVariable(value = "bookId") int id) {
        shoppingCartService.removeBook(id);
    }

}