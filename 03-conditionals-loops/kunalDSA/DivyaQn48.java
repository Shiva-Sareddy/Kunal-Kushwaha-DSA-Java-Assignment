package kunalDSA;

import java.util.Scanner;

public class DivyaQn48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = 2; k < Math.sqrt(n); k++) {
					if((arr[i] % k != 0 && arr[i] != 1) || (arr[j] % k != 0 && arr[j] != 1)) {
						System.out.println(arr[i] + " " + arr[j]);
					}
				}
			}
		}
		sc.close();

	}

}
