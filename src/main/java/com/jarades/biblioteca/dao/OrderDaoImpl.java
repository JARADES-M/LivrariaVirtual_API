package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.dao.interfaces.OrderDao;
import com.jarades.biblioteca.mockdata.MockData;
import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Order;
import com.jarades.biblioteca.resources.Status;

import java.util.List;

public class OrderDaoImpl implements OrderDao {

    MockData mockData = MockData.getInstance();

    @Override
    public List<Order> getOrders() {
        return mockData.getOrdersList();
    }

    @Override
    public Order getStatus(int orderId) {
        return mockData.getOrder(orderId);
    }

    @Override
    public void order(Order order) {
        mockData.order(order);
    }

    @Override
    public void cancelOrder(int orderId) {

    }

    @Override
    public void updateStatus(Order order) {

    }
}
