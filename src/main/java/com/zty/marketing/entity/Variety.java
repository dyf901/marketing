package com.zty.marketing.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
 * 种类表实体类
 * variety   种类表
 * id      咨询id
 * variety_name    种类名称
 * */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Variety {
    private int id;
    private String variety_name;

    public Variety(){
        super();
    }

    public Variety(int id, String variety_name) {
        this.id = id;
        this.variety_name = variety_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariety_name() {
        return variety_name;
    }

    public void setVariety_name(String variety_name) {
        this.variety_name = variety_name;
    }

    @Override
    public String toString() {
        return "Variety{" +
                "id=" + id +
                ", variety_name='" + variety_name + '\'' +
                '}';
    }
}
