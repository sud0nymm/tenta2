package practicetentaex2;

public class Circle extends Shape {

	private Circle currentCircle;
	private Circle previousCircle;
	private double radius;
	
	public Circle(double arg) {
		super("Circle ");
		radius = arg;
		computeArea();
	}
	
	public Circle getCurrentCircle() {
		return currentCircle;
	}
	
	public Circle getPreviousCircle() {
		return previousCircle;
	}
	
	public void computeArea() {
		area = radius*radius*3.14;
	}
	
	
	
}
