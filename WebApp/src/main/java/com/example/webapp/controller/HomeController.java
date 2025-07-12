package com.example.myapp.controller;

//classのインポート

//Springframewordのインポート
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

//JavaUtilityのインポート



@Controller
public class HomeController {
    
    /*
     * When access to root
     * Return index.html
     * 
     * param: non
     * return: String
     */
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "submit";
    }
}
