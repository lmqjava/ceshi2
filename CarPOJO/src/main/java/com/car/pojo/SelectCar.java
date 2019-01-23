package com.car.pojo;

import java.io.Serializable;

public class SelectCar implements Serializable {
	private Integer tid;
	private String story;
	private String dis;
	private String pailiang;
	private String color;
	private String cartype;
	private float price;
	
	private static final long serialVersionUID=1L;
	
	
	
    
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getDis() {
		return dis;
	}
	public void setDis(String dis) {
		this.dis = dis;
	}
	public String getPailiang() {
		return pailiang;
	}
	public void setPailiang(String pailiang) {
		this.pailiang = pailiang;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
