package kunalDSA;

import java.util.Scanner;

public class DivyaQn45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int minSum = arr[0] + arr[1]; 
		for(int i = 1; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] + arr[j] < minSum) {
					minSum = arr[i] + arr[j];
				}
			}
		}
		System.out.println(minSum);
		sc.close();
	}

}
