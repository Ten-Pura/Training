package com.example.myapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity //SpringにおいてDBのマッピングする
public class Message {
    @Id             //主キーのアノテーション
    @GeneratedValue //主キーの自動採番
    private Long id;

    private String content;

    public Message() {}

    public Message(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

}