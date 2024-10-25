package kunalDSA;

import java.util.Scanner;

public class DivyaQn70 {
	public static void subArraySum(int[] arr, int k) {
		int n = arr.length;
		for(int i = n-1; i >= 0; i--) {
			int sum = 0;
			for(int j = i; j < n; j++) {
				sum = sum + arr[j];
				if(sum == k) {
					for(int p = i; p <= j; p++) {
						System.out.print(arr[p] + " ");
					}
					System.out.println();
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		subArraySum(arr, k);
		sc.close();

	}

}
