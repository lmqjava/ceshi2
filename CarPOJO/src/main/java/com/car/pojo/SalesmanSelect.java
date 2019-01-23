package com.car.pojo;

import java.io.Serializable;

public class SalesmanSelect implements Serializable {
	private int particularsId;
	
	private String name;
	
	private String tel;
	
	private String email;
	
	private String salesmanUser;
	
	private String salesmanPass;
	
	private String level;

	public int getParticularsId() {
		return particularsId;
	}

	public void setParticularsId(int particularsId) {
		this.particularsId = particularsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSalesmanUser() {
		return salesmanUser;
	}

	public void setSalesmanUser(String salesmanUser) {
		this.salesmanUser = salesmanUser;
	}

	public String getSalesmanPass() {
		return salesmanPass;
	}

	public void setSalesmanPass(String salesmanPass) {
		this.salesmanPass = salesmanPass;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "SalesmanSelect [particularsId=" + particularsId + ", name=" + name + ", tel=" + tel + ", email=" + email
				+ ", salesmanUser=" + salesmanUser + ", salesmanPass=" + salesmanPass + ", level=" + level + "]";
	}

	
	
}
