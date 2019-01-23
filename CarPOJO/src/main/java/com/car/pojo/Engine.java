package com.car.pojo;

import java.io.Serializable;
import java.util.Date;



import com.fasterxml.jackson.annotation.JsonFormat;

public class Engine implements Serializable {
    private Integer ssId;

    private String ssName;

    private Date ssStartdata;

    private Date ssEnddata;

    private String ssAddress;

    private String ssLeixing;

    private Integer ssNum;

    private static final long serialVersionUID = 1L;

    public Integer getSsId() {
        return ssId;
    }

    public void setSsId(Integer ssId) {
        this.ssId = ssId;
    }

    public String getSsName() {
        return ssName;
    }

    public void setSsName(String ssName) {
        this.ssName = ssName == null ? null : ssName.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    public Date getSsStartdata() {
        return ssStartdata;
    }

    public void setSsStartdata(Date ssStartdata) {
        this.ssStartdata = ssStartdata;
    }


    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    public Date getSsEnddata() {
        return ssEnddata;
    }

    public void setSsEnddata(Date ssEnddata) {
        this.ssEnddata = ssEnddata;
    }

    public String getSsAddress() {
        return ssAddress;
    }

    public void setSsAddress(String ssAddress) {
        this.ssAddress = ssAddress == null ? null : ssAddress.trim();
    }

    public String getSsLeixing() {
        return ssLeixing;
    }

    public void setSsLeixing(String ssLeixing) {
        this.ssLeixing = ssLeixing == null ? null : ssLeixing.trim();
    }

    public Integer getSsNum() {
        return ssNum;
    }

    public void setSsNum(Integer ssNum) {
        this.ssNum = ssNum;
    }
}