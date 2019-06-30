package com.codeup.springblog.service;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


//This is where we do the business logic public findPostsByPerson

@Service
@Transactional //Says this layer is interacting with the database
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        Post savedPost = postRepository.save(post);
        // the savedPost that's new returens from the database with a brand new ID
        return savedPost;
    }

    @Override
    public List<Post> findAllPosts() {
        Iterable<Post> source = postRepository.findAll();

        List<Post> allPosts = new ArrayList<>();
        source.forEach(allPosts::add);

        return allPosts;

    }

    @Override
    public Post findPost(Long id) {
        Post foundPost = postRepository.findOne(id);
        return foundPost;
    }

    @Override
    public Post updatePost(Post post) {
        Post updatedPost = postRepository.save(post);
        //this post returns from the database with the updated values we passed in
        return updatedPost;
    }

    @Override
    public Boolean deletePost(Long id) {
        postRepository.delete(id);
        // TODO check logic to confirm delete succeeded
        return true;
    }
}
