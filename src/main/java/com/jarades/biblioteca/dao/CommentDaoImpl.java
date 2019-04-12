package com.jarades.biblioteca.dao;

import com.jarades.biblioteca.dao.interfaces.CommentDao;
import com.jarades.biblioteca.mockdata.MockData;
import com.jarades.biblioteca.resources.Comment;

public class CommentDaoImpl implements CommentDao {

    MockData mockData = MockData.getInstance();

    @Override
    public void comment(Comment comment) {
        mockData.getCommentList().add(comment);
    }

}
