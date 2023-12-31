package testProject;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color;
	
	public Shape() {
		
	}
	
	public Shape(int type, double height, double width, String color) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	public int getType() {
		return type;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String information() {
		return height + " " + width + " " + color;
	}
	
	
	
}
