package com.example.myapp.controller;

import com.example.myapp.model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class HomeController {

    //ルートにアクセスした時にindex.htmlを返す
    @RequestMapping("/")
    public String home() {
        return "index"; // src/main/resouces/static/index.html
    }

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute ContactForm contactForm, Model model) {
        //受け取ったデータをビューに渡す
        model.addAttribute("name",  contactForm.getName() );
        model.addAttribute("email", contactForm.getEmail());
        return "result";
    }
}
