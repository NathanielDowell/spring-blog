package com.codeup.springblog.controller;

import com.codeup.springblog.repository.AdRepository;
import com.codeup.springblog.model.Ad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ad")
public class AdController {

// Dependency injection, "manual way to do it":
//    private final AdRepository adsDao;
//
//    public AdController(AdRepository adsDao) { //dependency injection (@Autowired is another)
//        this.adsDao = adsDao;
//    }

    @Autowired
    private AdRepository adsDao;

    //Create
    @PostMapping(value = "/create")
    public String getForm(Model model) {
        model.addAttribute("Ad", new Ad());


        return "ads/create";
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<Ad> index() {
            return adsDao.findAll();
//
        }

//        @GetMapping("/ads-view")
//    private String index-view(Model model)
}
