package kunalDSA;

class PerimeterShapeCalculator{
	public int calculatePerimeter(int length){
		return length * 4;
	}

	public double calculatePerimeter(double length, double width){
		return 2 * (length + width);
	}
	
	public double calculatePerimeter(double radius){
		return 2 * Math.PI * radius;
	}
	
	public int calculatePerimeter(int side1, int side2, int side3){
		return side1 + side2 + side3;
	}
}

public class ShapePerimeterCalculator {

	public static void main(String[] args) {
		PerimeterShapeCalculator psc = new PerimeterShapeCalculator();
		
		int perimeterSquare = psc.calculatePerimeter(4);
		System.out.println("Perimeter of square: " + perimeterSquare);
		
		double perimeterRectangle = psc.calculatePerimeter(7.5d, 3.5d);
		System.out.println("Perimeter of rectangle: " + perimeterRectangle);
		
		double perimeterCircle = psc.calculatePerimeter(2.0d);
		System.out.println("Perimeter of circle: " + perimeterCircle);
		
		int perimeterTriangle = psc.calculatePerimeter(3, 4, 5);
		System.out.println("Perimeter of triangle: " + perimeterTriangle);
	}

}
