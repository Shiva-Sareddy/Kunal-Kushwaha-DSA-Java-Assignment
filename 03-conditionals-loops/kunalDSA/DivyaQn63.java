package kunalDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class DivyaQn63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] a = new int[m];
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		ArrayList<Integer> arr = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i < n && j < m) {
			if(a[i] == b[j]) {
				if(a[i]%2 != 0) {
					arr.add(a[i]);
				}
				i++;
				j++;
			}
			else if(a[i] < b[j]) {
				i++;
			}else {
				j++;
			}
		}
		if(arr.isEmpty()) {
			System.out.println("No common odd elements found.");
		}else {
			for(int el: arr) {
				System.out.print(el + " ");
			}
		}
		sc.close();
	}

}
