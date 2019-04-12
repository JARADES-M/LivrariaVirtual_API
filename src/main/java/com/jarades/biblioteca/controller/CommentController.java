package com.jarades.biblioteca.controller;

import com.jarades.biblioteca.resources.Comment;
import com.jarades.biblioteca.service.CommentServiceImpl;
import com.jarades.biblioteca.service.Interfaces.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Rest API: Biblioteca - comment", tags = {"Comentários"}, description = "Operações Rest")
@RestController
public class CommentController {

    CommentService commentService = new CommentServiceImpl();

    @ApiOperation("Registra Um Comentário")
    @RequestMapping(value = "/v1/comments", method = RequestMethod.POST)
    public void comment(@RequestBody Comment comment){
        commentService.comment(comment);
    }

}
