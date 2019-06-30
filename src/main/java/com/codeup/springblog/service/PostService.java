package com.codeup.springblog.service;

import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    // CREATE:
    Post savePost(Post post);


    //Find methods (READ):
    List<Post> findAllPosts();
    Post findPost(Long id);

    //Update
    Post updatePost(Post post);

    //Delete
    Boolean deletePost(Long id);

    // IntelliSense




}
