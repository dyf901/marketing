package com.zty.marketing.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
* 留言表实体类
* message   留言表
* id      留言id
* name    留言人姓名
* phone   留言人电话
* email   留言人邮箱
* content   留言内容
* */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
    private int id;
    private String name,phone,email,content;

    public Message(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
