package com.codeup.springblog.controller.rest;
import com.codeup.springblog.model.Post;
import com.codeup.springblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/post")
@RestController
public class PostRestController {

    @Autowired
    private PostService postService;

    // Read
    @GetMapping

    // Create

    @PostMapping(value = "/")
    public ResponseEntity<Post> postPost(@RequestBody Post post) {
        Post savedPost = postService.savePost(post);

        return  null;
    }



}
