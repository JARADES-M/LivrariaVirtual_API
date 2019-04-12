package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.OrderDaoImpl;
import com.jarades.biblioteca.dao.interfaces.OrderDao;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Order;
import com.jarades.biblioteca.resources.Status;
import com.jarades.biblioteca.service.Interfaces.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoImpl();

    @Override
    public List<Order> getOrders() {
        return orderDao.getOrders();
    }

    @Override
    public Order getStatus(int orderId) {
        return orderDao.getStatus(orderId);
    }

    @Override
    public void order(Order book) {
        orderDao.order(book);
    }

    @Override
    public void cancelOrder(int orderId) {
        orderDao.cancelOrder(orderId);
    }

    @Override
    public void updateStatus(Order order) {
        orderDao.updateStatus(order);
    }
}
