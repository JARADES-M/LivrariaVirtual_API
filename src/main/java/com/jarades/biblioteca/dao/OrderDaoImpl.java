package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.dao.interfaces.OrderDao;
import com.jarades.biblioteca.mockdata.MockData;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Status;

public class OrderDaoImpl implements OrderDao {

    MockData mockData = MockData.getInstance();

    @Override
    public Status getStatus(int orderId) {
        return null;
    }

    @Override
    public void order(Book book) {

    }

    @Override
    public void cancelOrder(int orderId) {

    }
}
