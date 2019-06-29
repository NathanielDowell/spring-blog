package com.codeup.springblog.controller;

import com.codeup.springblog.repository.AdRepository;
import com.codeup.springblog.model.Ad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdController {

    private final AdRepository adsDao;

    public AdController(AdRepository adsDao) { //dependency injection (@Autowired is another)
        this.adsDao = adsDao;
    }

    @GetMapping("/ads")
    @ResponseBody
    private Iterable<Ad> index() {
            return adsDao.findAll();
//            return adsDao.findByTitleStartingWith(String str);
        }

//        @GetMapping("/ads-view")
//    private String index-view(Model model)
}
