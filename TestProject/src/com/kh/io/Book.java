package com.kh.io;

public class Book { 

	private String title;
	private String author;
	private int code;
	private boolean isRent;
	
	Book(String title,String author, int code) {
		this.title = title;
		this.author = author;
		this.code = code;
		this.isRent = true;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setIsRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getCode() {
		return code;
	}
	
	public boolean getIsRent() {
		return this.isRent;
	}
	
	
	public String toString() {
		return this.code + "\t" + title + "\t" + this.author + "\t" + 
				(this.isRent ? "대여가능" : "대여불가");
	}
}
