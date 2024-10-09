package kunalDSA;

import java.util.Scanner;

public class GCDIterativeApproach {
	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		int gcd = findGCD(a, b);
		System.out.println("The GCD for " + a + " & " + b + ": " + gcd);
		sc.close();

	}

}
