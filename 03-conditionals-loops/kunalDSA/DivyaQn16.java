package kunalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class DivyaQn16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int res = smallest(arr);
		System.out.println(res);
		sc.close();
	}
	
	public static int smallest(int[] arr) {
		Arrays.sort(arr);
		int min = arr[arr.length-1];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0 && arr[i] < min) {
				min = arr[i];
				if(min == 1) {
					break;
				}
			}
		}
		if(min > 0) {
			return min;
		}else {
			return -1;
		}
	}

}
