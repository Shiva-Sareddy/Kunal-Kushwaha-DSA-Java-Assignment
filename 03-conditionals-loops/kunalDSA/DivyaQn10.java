package kunalDSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DivyaQn10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		HashSet<Integer> hset = new HashSet<>();
		for(int num: arr) {
			hset.add(num);
		}
		
		for(int num1: hset) {
			System.out.print(num1 + " ");
		}
		sc.close();

	}

}
