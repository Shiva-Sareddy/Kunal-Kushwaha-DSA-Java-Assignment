package kunalDSA;

import java.util.Scanner;

public class DivyaQn7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i: arr) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		sc.close();

	}

}
