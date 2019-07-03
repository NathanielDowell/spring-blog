package com.codeup.springblog.controller;

import com.codeup.springblog.model.Ad;
import com.codeup.springblog.repos.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdController {

    private AdRepository adsDao;

    public AdController(AdRepository adsDao) {
        this.adsDao = adsDao;
    }

    @GetMapping("/ads")
    @ResponseBody
    private Iterable<String> index() {
        return adsDao.getTitleWithGreatLengthNative();
    }


    @GetMapping("/ads-view")
    private String indexView(Model model) {
        model.addAttribute("ads", adsDao.findAll());
        return "ads/index";
    }

    @GetMapping("/ads/create")
    private String create() {
        return "ads/create";
    }

    @PostMapping("/ads/create")
    private String insert(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam int priceInCents) {
        Ad adToInsert = new Ad(title, description, priceInCents);
        adsDao.save(adToInsert);
        return "redirect:/ads-view";
    }

    @GetMapping("/ad-view-categories")
    private String viewCategoriesOnAd(Model model) {
        model.addAttribute("categories", adsDao.findOne(1L).getCategories());
        return "ads/listOfCategories";
    }


}