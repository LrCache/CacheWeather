package com.demo.liur.cacheweather.model;

/**
 * 地区父类，让省市县都继承本类
 * Created by Liur on 2016/6/16.
 */
public class Area {
    private int id;
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
