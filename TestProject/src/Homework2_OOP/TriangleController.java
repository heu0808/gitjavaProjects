package Homework2_OOP;

public class TriangleController {
	
	Shape s = new Shape();
	
	public TriangleController() {
		s = new Shape();
	}
	
	public double calcArea(double height,double width) {
		s = new Shape(3,height,width,"sky");
		
		return s.getHeight() * s.getWidth();
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형\n" + s.information();
	}
}
