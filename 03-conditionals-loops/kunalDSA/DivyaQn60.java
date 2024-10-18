package kunalDSA;

import java.util.Scanner;

public class DivyaQn60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int product = arr[i] * arr[j];
				if(product < min) {
					min = product;
				}
			}
		}
		System.out.println(min);
		sc.close();

	}

}
