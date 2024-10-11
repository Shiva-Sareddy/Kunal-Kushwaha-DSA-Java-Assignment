package kunalDSA;

import java.util.Scanner;

public class LCF {

	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if(b == 0) {
			return a;
		}else {
			return findGCD(b, a % b);
		}
	}
	
	public static int findLCF(int a, int b) {
		int gcd = findGCD(a,b);
		for(int i = 1; i <= gcd; i++) {
			if(a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		System.out.print("Enter number 1: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number 2: ");
		int b = sc.nextInt();
		
		int gcd = findGCD(a, b);
		System.out.println("The GCD for " + a + " & " + b + ": " + gcd);
		System.out.print("The Common factors are: ");
		
		int count = 0;
		for(int i = 1;i <= gcd && count < n; i++) {
			if(gcd % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		int lcf = findLCF(a, b);
		if(lcf == -1) {
			System.out.println("No factors greater than 2");
		}else {
			System.out.println("The Factor is: " + lcf);
		}
		sc.close();

	}

}
