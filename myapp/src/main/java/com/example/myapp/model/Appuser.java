package com.example.myapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity //SpringにおいてDBのマッピングする
public class Appuser {
    @Id             //主キーのアノテーション
    @GeneratedValue //主キーの自動採番
    private Long id;

    private String user_id;
    private String password;

    public Appuser() {}

    public Appuser(String user_id, String password) {
        this.user_id  = user_id;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}