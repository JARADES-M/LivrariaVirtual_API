package com.jarades.biblioteca.mockdata;

import com.jarades.biblioteca.resources.*;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    private MockData() {}

    private static MockData instance;

    public static synchronized MockData getInstance(){

        if (instance == null)
            instance = new MockData();

        return instance;
    }

    private List<User> userList = new ArrayList<User>() {
        {
            add(new User(77, "João", "joao@email.com"));
            add(new User(33, "José", "josé@email.com"));
            add(new User(99, "Ana", "ana@email.com"));
        }
    };

    private List<Book> bookList = new ArrayList<Book>() {
        {
            add(new Book(536, "Tim Tim Tam Tam", "Jhon", 2015, "Saraiva"));
            add(new Book(789, "Rá Tá Tá", "Clain", 2011, "Globo"));
            add(new Book(537, "Sá Rá Vá", "Gandalf", 1997, "Code"));
            add(new Book(914, "Bu Ti Quê", "Ilton", 2078, "FoxBit"));
        }
    };

    private List<Comment> commentList = new ArrayList<Comment>() {
        {
            add(new Comment(7983, bookList.get(1).getId(), userList.get(2), "Muito Bom!"));
            add(new Comment(3576, bookList.get(3).getId(), userList.get(2), "Muito Bom Mesmo!"));
            add(new Comment(1234, bookList.get(3).getId(), userList.get(0), "Bacana!"));
            add(new Comment(9531, bookList.get(0).getId(), userList.get(1), "Legal!"));
            add(new Comment(6482, bookList.get(2).getId(), userList.get(0), "Né Bom Não!"));
        }
    };

    private List<Book> shoppingCartList = new ArrayList<Book>() {
        {
            add(new Book(7755, "My Shop C", "Will", 2054, "Ypsilon"));
        }
    };

    private List<Order> ordersList = new ArrayList<Order>() {
        {
            add(new Order(7676, bookList.get(0), Status.PENDING));
            add(new Order(7476, bookList.get(3), Status.SHIPPED));
            add(new Order(7673, bookList.get(2), Status.COMPLETED));
        }
    };


    public List<Book> getBooks() {
        return this.bookList;
    }

    public void register (Book book){
        this.bookList.add(book);
    }

    public void comment (Comment comment) {
        this.commentList.add(comment);
    }

    /* Desconsidere a complexidade desse trexo, foque apenas no resultado */
    public List<Comment> getBookComments (long id) {
        List<Comment> bookComments = new ArrayList<>();
        for(Comment cmt: this.commentList) {
            if(cmt.getBookId() == id) {
                bookComments.add(cmt);
            }

        }
        return bookComments;
    }

// ----------------------------------------------------------------------------

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Book> getShoppingCartList() {
        return shoppingCartList;
    }

    public void setShoppingCartList(List<Book> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    public void order(Order order) {
        this.ordersList.add(order);
    }

    public Order getOrder(int orderId) {
        for (Order o: ordersList) {
            if (o.getId() == orderId)
                return o;
        }
        return null;
    }
}
