package kunalDSA;

import java.util.Scanner;

public class DivyaQn29 {
	public static int findSecondSmallest(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] < min) {
					min = arr[i]+ arr[j];
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = findSecondSmallest(arr);
		System.out.println(res);
		sc.close();
	}

}
