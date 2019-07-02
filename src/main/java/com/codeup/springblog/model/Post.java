package com.codeup.springblog.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @ManyToOne
//    @JoinColumn (name = "user_id") this isn't necessary if we are fine with Spring managing it (i.e. not previously existing data set that we need to actively control)
    private User author;


    public Post() {

    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @GetMapping("/posts/create")
    public String showCreateForm() {
        return "posts/create";
    }

//    @PostMapping("/posts/create")
//    public String create()

}
