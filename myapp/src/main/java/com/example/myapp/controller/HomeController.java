package com.example.myapp.controller;

//classのインポート
import com.example.myapp.model.ContactForm;
import com.example.myapp.model.Message;
import com.example.myapp.model.Appuser;
import com.example.myapp.repository.MessageRepository;
import com.example.myapp.repository.AppuserRepository;

//Springframewordのインポート
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

//JavaUtilityのインポート
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Controller
public class HomeController {
    private List<String> messages = new ArrayList<String>();

    //Appuserの依存性注入
    @Autowired
    private AppuserRepository appuserRepository;

    //ルートにアクセスした時にindex.htmlを返す
    @RequestMapping("/")
    public String home() {
        return "index"; // src/main/resouces/static/index.html
    }

    @GetMapping("/signup")
    public String showSingup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String postSingup(@ModelAttribute ContactForm contactForm) {
        //変数定義
        String user_id;
        String password;
        String hashed;
        //フォームのデータを取得
        user_id  = contactForm.getUser_id();
        password = contactForm.getPassword();
        //パスワードをハッシュ化
        hashed   = password;
        //デバッグ用に標準出力
        System.out.println(hashed);
        //ユーザー情報をDBに保存
        appuserRepository.save(new Appuser(user_id, hashed));
        //login.htmlにリダイレクト
        return "redirect:/login";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute ContactForm contactForm, Model model) {
        //受け取ったデータをビューに渡す
        //model.addAttribute("name",  contactForm.getName() );
        //model.addAttribute("email", contactForm.getEmail());
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
