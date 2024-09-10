package KunalDSA;

import java.util.Scanner;

public class K7 {
	public static void main(String[] args) {
		// To calculate Fibonacci Series up to n numbers.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get the Fibonacci Series: ");
		int n = sc.nextInt();
		int firstNum = 0, secondNum = 1;
		System.out.print("The Fibonacci Series for " + n + " is: ");
		for(int i = 1; i <= n; i++) {
			System.out.print(firstNum + " ");
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
		sc.close();
	}
}