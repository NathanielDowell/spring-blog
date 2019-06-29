package com.codeup.springblog.controller;


import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {

    private List<Post> getPosts() {
        return Arrays.asList(
                new Post()
        );
    }

    @GetMapping("/posts")
    @ResponseBody
    public String index() {return "posts index page";}


    @GetMapping("/posts/{id}")
    @ResponseBody

    public String show(@PathVariable long id) {return id + " view an individual post";}


    @GetMapping("/posts/create")
    @ResponseBody

    public String create() {return "view the form for creating a post";}


    @PostMapping("/posts/create")
    @ResponseBody

    public String insert() {return "create a new post";}

}