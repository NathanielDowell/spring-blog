package com.codeup.springblog.service;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.model.User;
import com.codeup.springblog.repos.PostRepository;
import com.codeup.springblog.repos.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SillySvc {

    private PostRepository postDao;
    private UserRepository userDao;

    public SillySvc(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    public int getTotalLengthOfPostTitlesAndUsernames() {
        Iterable<Post> posts = postDao.findAll();
        Iterable<User> users = userDao.findAll();
        int total = 0;
        for (Post post : posts) {
            total += post.getTitle().length();
        }
        for (User user : users) {
            total += user.getUsername().length();
        }
        return total;
    }

}