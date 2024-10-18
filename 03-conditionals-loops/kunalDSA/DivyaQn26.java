package kunalDSA;

import java.util.Scanner;

public class DivyaQn26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = occurence(arr);
		System.out.println(res);
		sc.close();
	}
	
	public static int occurence(int[] arr) {
		int max = arr[0];
		int count = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				count = count + 1;
			}
		}
		return count;
		
	}

}
