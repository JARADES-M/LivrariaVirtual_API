package com.jarades.biblioteca.mockdata;

import com.jarades.biblioteca.resources.Book;
import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.resources.User;

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
            add(new Comment(7983, bookList.get(1), userList.get(2), "Muito Bom!"));
            add(new Comment(3576, bookList.get(3), userList.get(2), "Muito Bom Mesmo!"));
            add(new Comment(1234, bookList.get(3), userList.get(0), "Bacana!"));
            add(new Comment(9531, bookList.get(0), userList.get(1), "Legal!"));
            add(new Comment(6482, bookList.get(2), userList.get(0), "Né Bom Não!"));
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

    public List<Comment> getBookComments () {
        return null;
    }

}
