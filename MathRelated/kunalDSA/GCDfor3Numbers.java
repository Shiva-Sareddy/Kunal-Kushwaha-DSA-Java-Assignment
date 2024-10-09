package kunalDSA;

import java.util.Scanner;

public class GCDfor3Numbers {
	
	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		if(b == 0) {
			return a;
		}else {
			return findGCD(b, a % b);
		}
	}
	
	public static int findGCD(int a, int b, int c) {
		return findGCD(findGCD(a,b), c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		
		System.out.print("Enter number 3: ");
		int c = sc.nextInt();
		
		int gcd = findGCD(a, b, c);
		System.out.println("The GCD Value is: " + gcd);
		sc.close();

	}

}
