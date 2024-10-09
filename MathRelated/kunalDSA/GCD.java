package kunalDSA;

import java.util.Scanner;

public class GCD {
	public static int findGCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return findGCD(b, a % b);
		}
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
