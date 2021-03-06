package com.innerbean.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Gallery {
	
	private Picture picture;
	private String title;
		
	public String getTitle() {
		return title;
	}

	@Required
	public void setTitle(String title) {
		this.title = title;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	
	public void displayGallery(){
		System.out.println("Gallery is displayed! You can also inject Picture class here!");
		picture.displayPicture();
	}

}
