package kunalDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class DivyaQn34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> neg = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				neg.add(arr[i]);
			}
		}
		
		ArrayList<Integer> odd = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 != 0 && arr[i] > 0) {
				odd.add(arr[i]);
			}
		}
		
		ArrayList<Integer> even = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0 && arr[i] >= 0) {
				even.add(arr[i]);
			}
		}
		for(int a: neg) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int a: odd) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int a: even) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
