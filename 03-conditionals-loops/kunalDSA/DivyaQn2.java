package kunalDSA;

import java.util.Scanner;

public class DivyaQn2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int currentSum = arr[0];
		int maxSum = arr[0];
		int start = 0;
		int end = 0;
		int temp = 0;
		
		
		for(int i = 1; i < n; i++) {
			if(currentSum < 0) {
				currentSum = arr[i];
				temp = i;
			} else {
				currentSum = currentSum + arr[i];
			}
			
			if(currentSum > maxSum) {
				maxSum = currentSum;
				start = temp;
				end = i;	
			}
		}
		System.out.println(maxSum);
		for(int i = start; i <= end ; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
