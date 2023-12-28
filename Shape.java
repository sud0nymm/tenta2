package practicetentaex2;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Shape implements Comparable <Shape> {

	private static ArrayList<Shape> allShapes = new ArrayList<Shape>();
	protected double area;
	private static int counter = 0;
	private String name;
	public final static int CIRCLE = 0, SQUARE = 1;
	
	public Shape(String arg) {
		
		counter++;
		name = arg + " " + counter;
		allShapes.add(this);
	}
	
	public abstract void computeArea();
	
	public static String listShapes() {
		String s = "List of Shapes:\n";
		for (Shape shap : allShapes) {
			s += shap.toString() + "\n";
		}
		return s;
	}
	
	public String getName() {
		return name;
	}
	
	public static String sortedListing(int arg) {
		String s1 = ""; 
		String s = "";
		ArrayList<Shape> circl = new ArrayList<Shape>();
		ArrayList<Shape> squar = new ArrayList<Shape>();
		
		for (int i = 0; i < allShapes.size(); i++) {
			if (allShapes.get(i) instanceof Circle) {
				circl.add(allShapes.get(i));
			}
		}
		
		for (int i = 0; i < allShapes.size(); i++) {
			if (allShapes.get(i) instanceof Square) {
				squar.add(allShapes.get(i));
			}
		}
		
		if (arg==CIRCLE) {
			s1 = "circles sorted: \n";
			Collections.sort(circl);
			for (Shape shap : circl) {
				s1 += shap + "\n";
			}
		}
		
		if (arg==SQUARE) {
			s1 = "squares sorted: \n";
			Collections.sort(squar);
			for (Shape shap : squar) {
				s1 += shap + "\n";
			}
		}
		
		return s1;
	}
	
	public int compareTo(Shape arg) {
		int returner = 0;
		if (area < arg.area) {
			returner = -1;
		} else if (area > arg.area){
			returner = 1;
		}
		
		return returner;
	}
	
	public String toString() {
		String s = String.format("Area:%2.2f", area);
		return "Name: " + name + ", " + s;
	}
	
}
