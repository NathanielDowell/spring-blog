package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

        @GetMapping("/ads-view")
    private String index-view(Model model)
}
