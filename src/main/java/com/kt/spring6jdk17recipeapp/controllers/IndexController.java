package com.kt.spring6jdk17recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kontelk on 8/20/23.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage() {
        //System.out.println("testing reloading");
        return "index";
    }
}
