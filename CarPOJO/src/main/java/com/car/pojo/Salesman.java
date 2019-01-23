package com.car.pojo;

public class Salesman {
    private Integer salesmanId;

    private Integer rolerId;

    private String salesmanUser;

    private String salesmanPass;

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public Integer getRolerId() {
        return rolerId;
    }

    public void setRolerId(Integer rolerId) {
        this.rolerId = rolerId;
    }

    public String getSalesmanUser() {
        return salesmanUser;
    }

    public void setSalesmanUser(String salesmanUser) {
        this.salesmanUser = salesmanUser == null ? null : salesmanUser.trim();
    }

    public String getSalesmanPass() {
        return salesmanPass;
    }

    public void setSalesmanPass(String salesmanPass) {
        this.salesmanPass = salesmanPass == null ? null : salesmanPass.trim();
    }
}