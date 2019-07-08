package com.codeup.springblog.repository;

import com.codeup.springblog.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
