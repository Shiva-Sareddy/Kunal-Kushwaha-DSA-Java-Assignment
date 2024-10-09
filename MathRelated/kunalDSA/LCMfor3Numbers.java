package kunalDSA;

import java.util.Scanner;

public class LCMfor3Numbers {
	
	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		if(b == 0) {
			return a;
		}else {
			return findGCD(b, a % b);
		}
	}
	
	public static int findLCM(int a, int b) {
		int gcd = findGCD(a,b);
		return Math.abs(a* b) / gcd;
	}
	
	public static int findLCM(int a, int b, int c) {
		return findLCM(findLCM(a,b),c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		
		System.out.print("Enter number 3: ");
		int c = sc.nextInt();
		
		int lcm = findLCM(a, b, c);
		System.out.println("The LCM Value is: " + lcm);
		sc.close();

	}

}
