package kunalDSA;

import java.util.Scanner;

public class DivyaQn12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(calculateSum(arr));
		sc.close();

	}
	
	public static int calculateSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length/2; i++) {
			sum = sum + arr[i];
		}
		return sum;
		
	}

}
