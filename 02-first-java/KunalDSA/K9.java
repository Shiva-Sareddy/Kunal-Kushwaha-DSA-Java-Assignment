package KunalDSA;

import java.util.Scanner;

public class K9 {

	public static void main(String[] args) {
		// To find Armstrong Number between two given number.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number (Small Number BigNumber)(Eg: 10 100): ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean found = false; // flag if no numbers found
		if(num2 > num1) {
			for(int i = num1; i <= num2 ; i++) {
				String converted = Integer.toString(i);
				int len = converted.length();
				int sum = 0;
				for(int j = 0; j <= len-1; j++) {
					int digit = Character.getNumericValue(converted.charAt(j));
					sum = (int) (sum + Math.pow(digit, len));
				}
				if(sum == i) {
					System.out.print(i + " ");
					found = true;
				}
			}
			if(found != true) {
				System.err.println("No Armstrong numbers found in this range!!");
			}
		} else {
			System.err.println("Enter in a given format :( ");
		}
		sc.close();
		
	}

}
