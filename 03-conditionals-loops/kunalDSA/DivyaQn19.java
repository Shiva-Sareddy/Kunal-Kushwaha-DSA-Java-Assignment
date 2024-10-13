package kunalDSA;

import java.util.Scanner;

public class DivyaQn19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int res = miss(arr);
		System.out.println(res);
		sc.close();
	}
	
	public static int miss(int[] arr) {
		int n = arr.length+1;
		int sum = n * (n+1)/2;
		int totalSum = 0;
		for(int i: arr) {
			totalSum += i;
		}
		return sum - totalSum;
		
	}

}
