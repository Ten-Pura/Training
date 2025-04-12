package com.example.myapp.controller;

//classのインポート
import com.example.myapp.model.ContactForm;
import com.example.myapp.model.Message;
import com.example.myapp.repository.MessageRepository;

//Springframewordのインポート
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

//JavaUtilityのインポート
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Controller
public class HomeController {
    private List<String> messages = new ArrayList<String>();

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

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/board")
    public String showBoard(Model model) {
        //投稿されたメッセージリストをビューに渡す
        model.addAttribute("messages", messageRepository.findAll());
        return "board";
    }

    @PostMapping("/board")
    public String postBoard(@ModelAttribute ContactForm contactForm) {
        //
        messageRepository.save(new Message(contactForm.getMessage()));
        return "redirect:/board";
    }
}
