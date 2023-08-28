package testProject;

public class TriangleController {

	Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s = new Shape(3, height, width, "white");
		return s.getWidth() * s.getHeight() / 2;
		
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형" + s.information();
	}
}
