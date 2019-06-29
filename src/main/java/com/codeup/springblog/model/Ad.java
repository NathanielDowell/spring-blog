package com.codeup.springblog.model;
import javax.persistence.*;

@Entity
@Table(name="ads")
public class Ad {

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;
}