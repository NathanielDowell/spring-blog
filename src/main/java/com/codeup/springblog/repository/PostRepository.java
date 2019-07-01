package com.codeup.springblog.repository;


import com.codeup.springblog.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;


public interface PostRepository extends CrudRepository<Post, Long> {

}
