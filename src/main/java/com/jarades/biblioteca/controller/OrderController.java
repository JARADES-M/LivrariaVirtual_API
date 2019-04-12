package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Order;
import com.jarades.biblioteca.resources.Status;
import com.jarades.biblioteca.service.Interfaces.OrderService;
import com.jarades.biblioteca.service.OrderServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(value = "Order", tags = {"Pedidos"}, description = "Operações Rest")
@RestController
@RequestMapping(value = {"v1/orders"})
public class OrderController implements OrderService{

    OrderService orderService = new OrderServiceImpl();

    @ApiOperation(value = "Lista todos os Pedidos")
    @RequestMapping(method = RequestMethod.GET)
    @Override
    public List<Order> getOrders(){
        return orderService.getOrders();
     }

    @ApiOperation("Identifica o status de um pedido")
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    @Override
    public Order getStatus(@PathVariable("orderId") int orderId) {
        return orderService.getStatus(orderId);
    }

    @ApiOperation("Registra o pedido para um livro")
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public void order(@RequestBody Order book) {
        orderService.order(book);
    }

    @ApiOperation("Cancela um pedido")
    @RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE)
    @Override
    public void cancelOrder(@PathVariable("orderId") int orderId) {
        orderService.cancelOrder(orderId);
    }

    @ApiOperation("Atualizao Status de um pedido")
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public void updateStatus(@RequestBody Order order) {
        orderService.updateStatus(order);
    }

}
