package kunalDSA;

import java.util.Scanner;

public class LCM {
	public static int findGCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return findGCD(b, a % b);
		}
	}
	
	public static int findLCM(int a, int b) {
		int gcd = findGCD(a, b);
		return Math.abs(a * b)/ gcd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter a number 2: ");
		int b = sc.nextInt();
		int lcm = findLCM(a, b);
		System.out.println("The LCM of " + a + " & " + b + ": " + lcm);
		sc.close();
	}

}
