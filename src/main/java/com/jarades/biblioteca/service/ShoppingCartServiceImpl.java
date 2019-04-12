package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.ShoppingCartDaoImpl;
import com.jarades.biblioteca.dao.interfaces.ShoppingCartDao;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.service.Interfaces.ShoppingCartService;

import java.util.List;

public class ShoppingCartServiceImpl implements ShoppingCartService {

    ShoppingCartDao shoppingCartDao = new ShoppingCartDaoImpl();

    @Override
    public List<Book> getItems() {
        return shoppingCartDao.getItems();
    }

    @Override
    public void addBook(Book book) {
        shoppingCartDao.addBook(book);
    }

    @Override
    public void removeBook(int id) {
        shoppingCartDao.removeBook(id);
    }
}
