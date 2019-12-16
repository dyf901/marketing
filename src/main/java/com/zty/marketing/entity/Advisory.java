package com.zty.marketing.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
* 咨询表实体类
* advisory   咨询表
* id      咨询id
* name    咨询者姓名
* phone   咨询者电话
* project_name   咨询项目名称
* createtime   上传时间
* variety   种类
* */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Advisory {
    private int id;
    private String name,phone,project_name,createtime,variety;

    public Advisory(){
        super();
    }

    public Advisory(int id, String name, String phone, String project_name, String createtime, String variety) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.project_name = project_name;
        this.createtime = createtime;
        this.variety = variety;
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Advisory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", project_name='" + project_name + '\'' +
                ", createtime='" + createtime + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
}
