package kunalDSA;

import java.util.Scanner;

public class DivyaQn51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] % 2 == 0 && arr[j] % 2 == 0) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		sc.close();

	}

}
