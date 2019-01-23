package com.car.pojo;

import java.io.Serializable;

public class LbImage implements Serializable {
    private Integer imgId;

    private String imgAddress;

    private String lbImg;

    private static final long serialVersionUID = 1L;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress == null ? null : imgAddress.trim();
    }

    public String getLbImg() {
        return lbImg;
    }

    public void setLbImg(String lbImg) {
        this.lbImg = lbImg == null ? null : lbImg.trim();
    }

	@Override
	public String toString() {
		return "LbImage [imgId=" + imgId + ", imgAddress=" + imgAddress + ", lbImg=" + lbImg + "]";
	}

	public LbImage() {
		super();
	}

	public LbImage(Integer imgId, String imgAddress, String lbImg) {
		super();
		this.imgId = imgId;
		this.imgAddress = imgAddress;
		this.lbImg = lbImg;
	}
	
    
}