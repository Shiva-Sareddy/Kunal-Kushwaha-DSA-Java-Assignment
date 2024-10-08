package kunalDSA;

import java.util.Scanner;

public class PrimeNumber1 {
	
	boolean PrimeNumberCheck(int n) {
		
		boolean isPrime = true;
		if(n <= 1) {
			isPrime = false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		PrimeNumber1 dq3 = new PrimeNumber1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(dq3.PrimeNumberCheck(n)) {
			System.out.println("True, It is a Prime Number");
		}else {
			System.out.println("False, It is not a Prime Number");
		}
		sc.close();

	}

}
