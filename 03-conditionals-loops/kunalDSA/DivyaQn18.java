package kunalDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class DivyaQn18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		ArrayList<Integer> arr3 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr1[i] == arr2[j]) {
					 arr3.add(arr1[i]);
					 break;
				}
			}
		}
		for(int a: arr3) {
			System.out.print(a + " ");
		}

		sc.close();

	}

}
