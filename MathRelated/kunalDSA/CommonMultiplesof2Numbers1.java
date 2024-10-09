package kunalDSA;

import java.util.Scanner;

public class CommonMultiplesof2Numbers1 {
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
		return Math.abs(a*b) / gcd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = sc.nextInt();
		
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		
		int lcm = findLCM(a,b);
		
		for(int i = 1; i <= n; i++) {
			System.out.print(lcm * i + " ");
		}
		System.out.println();
		System.out.println("LCM is: " + lcm);
		sc.close();

	}

}
