package com.jarades.biblioteca.dao.interfaces;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Order;
import com.jarades.biblioteca.resources.Status;

public interface OrderDao {
    public Status getStatus(Order order);
    public void order(Book book);
    public void cancelOrder(Order order);
}
