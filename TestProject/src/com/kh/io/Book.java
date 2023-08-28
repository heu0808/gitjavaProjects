package com.kh.io;

public class Book { 

	private String title;
	private String author;
	private int code;
	
	Book(String title,String author, int code) {
		this.title = title;
		this.author = author;
		this.code = code;
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
	
	public String getTitle() {
		return title;
	}
	
	
	
	public String toString() {
		return this.code + "\t" + title + "\t" + this.author;
	}
}
