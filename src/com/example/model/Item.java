package com.example.model;

public class Item {
	private String name;
	private int ImgID;
	public Item(String string, int imga){
		this.name=name;
		this.ImgID=ImgID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getImgID() {
		return ImgID;
	}
	public void setImgID(int imgID) {
		this.ImgID = imgID;
	}
}
