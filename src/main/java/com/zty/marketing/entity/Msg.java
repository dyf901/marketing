package com.zty.marketing.entity;

public class Msg {
    private String message;//中文信息
    private Object data;//实体
    private Object statistics;

    public Msg(){
        super();
    }

    public Msg(String message, Object data, Object statistics) {
        this.message = message;
        this.data = data;
        this.statistics = statistics;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getStatistics() {
        return statistics;
    }

    public void setStatistics(Object statistics) {
        this.statistics = statistics;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", statistics=" + statistics +
                '}';
    }
}
