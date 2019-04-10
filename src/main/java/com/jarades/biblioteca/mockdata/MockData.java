package com.jarades.biblioteca.mockdata;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.resources.User;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    public MockData() {
    }

    static List<User> userList = new ArrayList<User>() {
        {
            add(new User(77, "João", "joao@email.com"));
            add(new User(33, "José", "josé@email.com"));
            add(new User(99, "Ana", "ana@email.com"));
        }
    };

    static List<Book> bookList = new ArrayList<Book>() {
        {
            add(new Book(536, "Tim Tim Tam Tam"));
            add(new Book(789, "Rá Tá Tá"));
            add(new Book(537, "Sá Rá Vá"));
            add(new Book(914, "Bu Ti Quê"));
        }
    };

    private List<Comment> commentList = new ArrayList<Comment>() {
        {
            add(new Comment(7983, bookList.get(1), userList.get(2), "Muito Bom!"));
            add(new Comment(3576, bookList.get(3), userList.get(2), "Muito Bom Mesmo!"));
            add(new Comment(1234, bookList.get(3), userList.get(0), "Bacana!"));
            add(new Comment(9531, bookList.get(0), userList.get(1), "Legal!"));
            add(new Comment(6482, bookList.get(2), userList.get(0), "Né Bom Não!"));
        }
    };


    public static List<Book> getBooks() {
        return bookList;
    }
    public static void register (Book book){
        bookList.add(book);
    }

}
