package com.codeup.springblog.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.service.PostService;

@RequestMapping("/post")
@RestController
public class PostRestController {

    @Autowired
    private PostService postService;


    //Create
    // below is same as @PostMapping(value ="/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Post> postPost(@RequestBody Post post){

        Post savedPost = postService.savePost(post);

        return new ResponseEntity<>(savedPost, HttpStatus.OK );

        /**
         *    this controller returns a JSON object, if you want to use Angular or React Javascript
         *
         *    { id: 1, title: 'My First Post', body: 'One day blah blah blah'}
         *
         *
         *   @PostMapping("/")
         *
         *   // set these values with a form
         *   var post = {id: 0, title: '', body: ''}
         *
         *   in AngularJS javascript, get your
         *
         *   function createPost(){
         *     http.post(http://localhost:8080/post/, post).
         *       .then( (response) => {   // response is "OK"
         *   	     data = response.data;  // data in the response is (An
         *        })
         *        .catch( (error) => {
         *         console.log(error); <-- prints out 500;
         *        };
         *    }
         *
         *
         */

    }

    // Read
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Post>> getPosts(){

        List<Post> allPosts = postService.findAllPosts();

        return new ResponseEntity<>(allPosts, HttpStatus.OK );
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Post> getPost(@RequestParam Long id){

        Post foundPost = postService.findPost(id);

        if(foundPost == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(foundPost, HttpStatus.OK );
    }


    // Update
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Post> updatePost(@RequestBody Post post){

        Post updatedPost = postService.updatePost(post);

        return new ResponseEntity<>(updatedPost, HttpStatus.OK);
    }


    // Delete
    @DeleteMapping( value = "/{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> deletePost(@RequestParam Long id){

        Boolean isDeleted = postService.deletePost(id);

        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }

}

