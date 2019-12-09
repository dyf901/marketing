package com.zty.marketing.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
* 咨询表实体类
* advisory   咨询表
* id      咨询id
* name    咨询者姓名
* phone   咨询者电话
* project_name   咨询项目名称
* */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Advisory {
    private int id;
    private String name,phone,project_name;

    public Advisory(){
        super();
    }

    public Advisory(int id, String name, String phone, String project_name) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.project_name = project_name;
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

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    @Override
    public String toString() {
        return "Advisory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", project_name='" + project_name + '\'' +
                '}';
    }
}