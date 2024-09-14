package kunalDSA;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		//Area of Triangle is 1/2 (base * height)
		Scanner sc = new Scanner(System.in);
		double half = 0.5;
		System.out.print("Enter Value for Base: ");
		double base = sc.nextDouble();
		System.out.print("Enter Value for Height(cm): ");
		double height = sc.nextDouble();
		double areaOfTriangle = half * (base * height);
		if (base > 0 && height > 0) {
			System.out.println("Area of Triangle is: " + areaOfTriangle);
		}else {
			System.err.println("Entered \"0\" for all :/ ");
		}
		
		sc.close();
	}

}
