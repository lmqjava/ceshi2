package com.car.pojo;

public class State {
    private String state;

    private Integer sssid;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getSssid() {
        return sssid;
    }

    public void setSssid(Integer sssid) {
        this.sssid = sssid;
    }
}