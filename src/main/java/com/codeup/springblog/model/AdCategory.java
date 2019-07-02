package com.codeup.springblog.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class AdCategory {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique=true)
    private String name;

}
