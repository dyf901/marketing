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
* createtime   上传时间
* */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
    private int id;
    private String name,phone,email,content,createtime;

    public Message(){
        super();
    }

    public Message(int id, String name, String phone, String email, String content, String createtime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.content = content;
        this.createtime = createtime;
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
