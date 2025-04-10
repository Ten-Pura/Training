package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //ルートにアクセスした時にindex.htmlを返す
    @RequestMapping("/")
    public String home() {
        return "index.html"; // src/main/resouces/static/index.html
    }
}
