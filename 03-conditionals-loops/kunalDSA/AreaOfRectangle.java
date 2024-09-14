package kunalDSA;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("## Area of Rectangle ##");
		System.out.print("Enter Length: ");
		double length = sc.nextDouble();
		System.out.print("Enter Width: ");
		double width = sc.nextDouble();
		double areaOfRectangle = length * width;
		if (length <= 0 || width <= 0) {
			if (length <= 0) {
				System.err.println("Length cannot be less than ZERO :( ");
			}
			if(width <= 0) {
				System.err.println("Width cannot be less than ZERO :( ");
			}
		}else {
			System.out.println("Area of Rectangle with length " + length + " and width " + width + " is: " + areaOfRectangle);
		}
		sc.close();
	}

}
