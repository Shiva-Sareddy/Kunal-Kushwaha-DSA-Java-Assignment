package kunalDSA;

import java.util.Scanner;

public class DivyaQn76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] + arr[j] == s) {
					if(arr[j] >= arr[i]) {
						System.out.println(arr[i] + " " + arr[j]);
					}else {
						System.out.println(arr[j] + " " + arr[i]);
					}
				}
			}
		}
		sc.close();

	}

}
