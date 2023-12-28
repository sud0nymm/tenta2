package practicetentaex2;

public class Square extends Shape{

	private Square currentSquare;
	private Square previousSquare;
	private double length;
	
	public Square(double arg) {
		super("Square");
		length  = arg;
		computeArea();
	}
	
	public Square getCurrentCircle() {
		return currentSquare;
	}
	
	public Square getPreviousCircle() {
		return previousSquare;
	}
	
	public void computeArea() {
		area = length*length;
	}
}
