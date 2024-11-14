package kunalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class DivyaQn88 {
	public static int[] rotateArray(int[] arr,int k) {
		int n = arr.length;
		int[] array = new int[n];
		for(int i = 0; i < k; i++) {
			array[i] = arr[n-k + i];
		}
		for(int i = k; i < n; i++) {
			array[i] = arr[i-k];
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arrRes =  rotateArray(arr, k);
		System.out.println(Arrays.toString(arrRes));
		sc.close();
	}

}
