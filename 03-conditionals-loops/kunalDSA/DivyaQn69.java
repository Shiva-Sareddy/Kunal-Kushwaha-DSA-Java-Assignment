package kunalDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class DivyaQn69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			boolean non = true;
			for(int j = 0; j < m; j++) {
				if(a[i] == b[j]) {
					non = false;
					break;
				}
			}
			if(non) {
				arr.add(a[i]);
			}
		}
		
		for(int j = 0; j < m; j++) {
			boolean non = true;
			for(int i = 0; i < n; i++) {
				if(a[i] == b[j]) {
					non = false;
					break;
				}
			}
			if(non) {
				arr.add(b[j]);
			}
		}
		System.out.println(arr);
		sc.close();

	}

}
