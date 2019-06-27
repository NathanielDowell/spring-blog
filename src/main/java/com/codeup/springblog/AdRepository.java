package com.codeup.springblog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdRepository extends CrudRepository<Ad, Long> {

}
