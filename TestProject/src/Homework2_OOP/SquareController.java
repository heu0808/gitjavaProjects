package Homework2_OOP;

public class SquareController {
	
	Shape s = new Shape();
	
	public SquareController() {
		s = new Shape();
	}
	
	
	public double calcPerimeter(double height,double width) {
		s = new Shape(4, height, width, "white");
		
		return s.getHeight()*2 + s.getWidth()*2;
	}
	
	public double calcArea(double height,double width) {
		s = new Shape(3, height, width, "blue");
		
		return s.getHeight() * s.getWidth();
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		 
		return "사각형\n" +s.information();
		
	}
}
