package com.jarades.biblioteca.dao.interfaces;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Order;
import com.jarades.biblioteca.resources.Status;

import java.util.List;

public interface OrderDao {
    public List<Order> getOrders();
    public Order getStatus(int orderId);
    public void order(Order order);
    public void cancelOrder(int orderId);
    public void updateStatus(Order order);
}
