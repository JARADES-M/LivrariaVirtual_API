package com.jarades.biblioteca.service;

import com.jarades.biblioteca.dao.CommentDaoImpl;
import com.jarades.biblioteca.dao.interfaces.CommentDao;
import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.service.Interfaces.CommentService;

public class CommentServiceImpl implements CommentService {

    CommentDao commentDao = new CommentDaoImpl();

    @Override
    public void comment(Comment comment) {
        commentDao.comment(comment);
    }
}
