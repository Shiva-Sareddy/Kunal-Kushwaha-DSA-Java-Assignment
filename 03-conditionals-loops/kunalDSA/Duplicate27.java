package kunalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate27 {
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
		Arrays.sort(arr);
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[0] == arr[i]) {
				count++;
			}
		}
		return count;
		
	}
}
