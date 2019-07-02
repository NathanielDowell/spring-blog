package com.codeup.springblog.controller;


import com.codeup.springblog.model.Post;
import com.codeup.springblog.repository.PostRepository;
import com.codeup.springblog.repository.UserRepository;
import com.codeup.springblog.service.StringService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class PostController {

    private PostRepository postDao;
    private UserRepository userDao;
    private StringService strSvc;

    public PostController(PostRepository postDao, UserRepository userDao, StringService strSvc) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.strSvc = strSvc;
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

    @GetMapping("/test-service")
    @ResponseBody
    public String testService(@PathVariable String str) {
        return strSvc.returnInCaps(str);
    }

}
