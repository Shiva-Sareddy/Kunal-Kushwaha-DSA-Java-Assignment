package kunalDSA;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		int start = 2;
		
		while(count < n) {
			boolean isPrime = true;
			for(int i = 2; i <= Math.sqrt(start); i++) {
				if(start%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(start + " ");
				count++;
			}
			start++;
			
		}
		sc.close();

	}

}
