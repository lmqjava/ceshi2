package com.car.pojo;

import java.io.Serializable;


public class Trademark implements Serializable{
    private Integer tid;

    private Integer mid;

    private String story;
    
    private static final long serialVersionUID=1L;
    
  
    
  
   
   

	


	public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story == null ? null : story.trim();
    }
}