package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/t")
    public String thyme(Model model) {

        model.addAttribute("username", "Fred");
        return "thyme";
    }

}
