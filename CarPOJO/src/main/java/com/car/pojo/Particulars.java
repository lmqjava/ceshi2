package com.car.pojo;

public class Particulars {
    private Integer particularsId;

    private Integer rid;

    private Integer salesmanId;

    private String name;

    private String tel;

    private String email;

    public Integer getParticularsId() {
        return particularsId;
    }

    public void setParticularsId(Integer particularsId) {
        this.particularsId = particularsId;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}