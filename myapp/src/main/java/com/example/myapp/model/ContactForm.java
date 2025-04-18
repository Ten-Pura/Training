package com.example.myapp.model;

public class ContactForm {
    private String user_id;
    private String password;
    private String message;

    //ゲッターとセッター
    public String getUser_id() { return user_id; }
    public void setUser_id(String user_id) { this.user_id = user_id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

}