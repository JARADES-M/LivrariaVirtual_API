package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.OrderDaoImpl;
import com.jarades.biblioteca.dao.interfaces.OrderDao;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Status;
import com.jarades.biblioteca.service.Interfaces.OrderService;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoImpl();

    @Override
    public Status getStatus(int orderId) {
        return orderDao.getStatus(orderId);
    }

    @Override
    public void order(Book book) {
        orderDao.order(book);
    }

    @Override
    public void cancelOrder(int orderId) {
        orderDao.cancelOrder(orderId);
    }
}
