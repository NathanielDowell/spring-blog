package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "Hello!";
        }

        @GetMapping("/goodbye")
        @ResponseBody
        public String goodbye() {
                return "Goodbye!";
            }



            //Path Variables - allows us to customize view for user
            @GetMapping("/hello/{name}")
            @ResponseBody
            public String helloName(@PathVariable String name) {
                return "Howdy, " + name;
            }

            @GetMapping("/favnum/{num}")
            @ResponseBody
            public String getFavNum(@PathVariable int num) {
                return "Favorite num is: " + num;
            }

            @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
            @ResponseBody
            public String addOne(@PathVariable int number) {
                return  number + " plus 1 is " + (number + 1);
            }


    }

