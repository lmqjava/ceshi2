package com.car.pojo;

import java.io.Serializable;

public class Carfm implements Serializable {
    private Integer cId;

    private Integer imgId;

    private String cName;

    private Integer cMoney;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcMoney() {
        return cMoney;
    }

    public void setcMoney(Integer cMoney) {
        this.cMoney = cMoney;
    }
}