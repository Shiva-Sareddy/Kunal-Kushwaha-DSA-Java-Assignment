package kunalDSA;

import java.util.Scanner;

public class DivyaQn30 {

	public static int[] findSecondSmallest(int[] arr) {
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length-1-i]; 
		}
		
		return arr2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = findSecondSmallest(arr);
		for(int e: res) {
			System.out.print(e + " ");
		}
		sc.close();
	}

}
