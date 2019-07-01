package com.codeup.springblog.repository;

import com.codeup.springblog.model.Ad;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;


public interface AdRepository extends CrudRepository<Ad, Long> {

}
