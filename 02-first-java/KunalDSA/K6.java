package KunalDSA;

import java.util.Scanner;

public class K6 {
	public static void main(String[] args) {
		//Input currency in rupees and output in USD
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rupees to convert into USD: ");
		int rupee = sc.nextInt();
		System.out.println("The Conversion of Rupees " + rupee + " into USD is " + (rupee / 83.9368));
		sc.close();
	}
}
