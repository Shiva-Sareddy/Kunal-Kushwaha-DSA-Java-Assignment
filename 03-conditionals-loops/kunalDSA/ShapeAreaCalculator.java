package kunalDSA;
class areaShapeCalculator{
	public int calculateArea(int length){
		return length * length;
	}
	public double calculateArea(double length, double width){
		return length * width;
	}
	public double calculateArea(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
	public double calculateArea(int base, double width){
		return ((base * width) / 2);
	}
}

public class ShapeAreaCalculator {

	public static void main(String[] args) {
		areaShapeCalculator sac = new areaShapeCalculator();
		
		int areaSquare = sac.calculateArea(5);
		System.out.println("Area of square: " + areaSquare);
		
		double areaRectangle = sac.calculateArea(7.5d, 4.0d);
		System.out.println("Area of rectangle: " + areaRectangle);
		
		double areaCircle = sac.calculateArea(3.0d);
		System.out.println("Area of circle: " + areaCircle);
		
		double areaTriangle = sac.calculateArea(8, 6.5d);
		System.out.println("Area of triangle: " + areaTriangle);
	}

}
