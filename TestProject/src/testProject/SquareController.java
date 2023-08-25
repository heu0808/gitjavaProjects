package testProject;

public class SquareController {
	
	Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width,"white");
		return s.getHeight() * 2 + s.getWidth() * 2;
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width, "white");
		return s.getWidth() * s.getHeight();
	}
	
	public void paintColor() {
		s.setColor("white");
	}
	
	public String print() {
		return "사각형" + s.information();
	}
}
