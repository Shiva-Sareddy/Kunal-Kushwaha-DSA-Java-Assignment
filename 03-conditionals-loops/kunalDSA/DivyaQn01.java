package kunalDSA;

import java.util.Scanner;

public class DivyaQn01 {
	
	public int diff(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DivyaQn01 dq = new DivyaQn01();
		System.out.print("Enter First number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("The Difference is: " + dq.diff(a, b));
		sc.close();
	}

}
