package com.car.pojo;

import java.io.Serializable;

public class SelectAll implements Serializable {

    private static final long serialVersionUID=1L;

    private String username;
    private String usertel;
    private Integer car_age;
    private Integer price;
    private String cartype;
    private String color;
    private String story;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public Integer getCar_age() {
        return car_age;
    }

    public void setCar_age(Integer car_age) {
        this.car_age = car_age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
