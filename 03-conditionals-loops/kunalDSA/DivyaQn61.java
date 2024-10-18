package kunalDSA;

import java.util.Scanner;

public class DivyaQn61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int product = arr[i] * arr[j];
				if(product > max) {
					max = product;
				}
			}
		}
		System.out.println(max);
		sc.close();

	}

}
