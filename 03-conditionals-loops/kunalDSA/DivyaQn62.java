package kunalDSA;

import java.util.Scanner;

public class DivyaQn62 {
	public static int sorting(int[] arr) {
		int n = arr.length;
		int res = -1;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[i]) {
					res = arr[j];
					break;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int miss = sorting(arr);
		System.out.println(miss);
		sc.close();
	}

}
