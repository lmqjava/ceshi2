package com.car.pojo;

import java.io.Serializable;

public class SelectUser implements Serializable{
	private static final long serialVersionUID=1L; 
	
	private Integer uuid;
	
	private String username;
	
	private String usertel;
	
	private String region;
	
	private String username1;
	
	private String userpass;
	

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	@Override
	public String toString() {
		return "SelectUser [uuid=" + uuid + ", username=" + username + ", usertel=" + usertel + ", region=" + region
				+ ", username1=" + username1 + ", userpass=" + userpass + "]";
	}

	
	
	
}
