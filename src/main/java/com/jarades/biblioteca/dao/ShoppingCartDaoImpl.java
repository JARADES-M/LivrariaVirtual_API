package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.dao.interfaces.ShoppingCartDao;
import com.jarades.biblioteca.mockdata.MockData;
import com.jarades.biblioteca.resources.Book;

import java.util.List;

public class ShoppingCartDaoImpl implements ShoppingCartDao {

    MockData mockData = MockData.getInstance();

    @Override
    public List<Book> getItems() {
        return mockData.getShoppingCartList();
    }

    @Override
    public void addBook(Book book) {
        mockData.getShoppingCartList().add(book);
    }

    @Override
    public void removeBook(int id) {
        mockData.getShoppingCartList().removeIf(book -> book.getId() == id);
    }
}
