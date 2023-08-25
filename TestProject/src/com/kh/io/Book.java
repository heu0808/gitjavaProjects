package com.kh.io;

public class Book {
	String title;
	
	Book(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return this.title;
	}
}
