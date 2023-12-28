package practicetentaex2;

public class Question2 {

	public static void main(String[] args) {
		
		new Circle(1.0);
		new Square(2.0);
		new Circle(2.0);
		new Square(3.0);
		new Circle(1.5);
		new Square(2.2);
		new Square(3.2);
		
		System.out.println(Shape.listShapes());
		
		System.out.println(Shape.sortedListing(Shape.CIRCLE));
		
		System.out.println(Shape.sortedListing(Shape.SQUARE));
	
		// dont really understand but oh well
		String s[] = Shape.listShapes().split(" ");
		
		for (int i = s.length-1; i > 0; i--) {
			if (s[i].equals("Circle")) {
				System.out.println(s[i] + " " + s[i + 2]);
			}
		}
		
		System.out.println("\n");
		
		for (int i = s.length-1; i > 0; i--) {
			if (s[i].equals("Square")) {
				System.out.println(s[i] + " " + s[i + 1]);
			}
		}
		
	}

}
