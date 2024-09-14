package kunalDSA;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// area of circle = pi r square
		double PI = Math.PI;
		System.out.println(" ### Calculate Area of Circle ###");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius or Diameter: ");
		int radius = sc.nextInt();
		System.out.print("What you Entered Radius or Diameter(R or D): ");
		String rd = sc.next().toUpperCase();
		char rdResult = rd.charAt(0);
		float areaOfCircle;
		if(rdResult == 'R' || rdResult == 'D') {
			if(rdResult == 'R') {
				areaOfCircle = (float) (PI * Math.pow(radius, 2));
				System.out.println("Area of Circle with radius " + radius + " is: " + areaOfCircle);
			}else {
				areaOfCircle = (float) (PI * Math.pow((radius/2),2));
				System.out.println("Area of Circle with diameter " + radius + " is: " + areaOfCircle);
			}
		}else {
			System.err.println("Entered Invalid Character :( ");
		}
		sc.close();
		
	}

}
