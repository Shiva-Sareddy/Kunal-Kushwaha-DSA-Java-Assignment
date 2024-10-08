package kunalDSA;

import java.util.Scanner;

public class PrimeNumber2 {
	
	public static boolean PrimeNumberCheck(int n) {
		boolean isPrime = true;
		if(n <= 1) {
			isPrime = false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public static void Primes(int n) {
		for(int i = 2; i <= n; i++) {
			if(PrimeNumberCheck(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeNumberCheck(n);
		Primes(n);
		sc.close();

	}

}
