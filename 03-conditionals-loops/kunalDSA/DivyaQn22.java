package kunalDSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DivyaQn22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr1 = sc.nextLine().split(" ");
		int len = arr1.length;
		Integer[] arr2 = new Integer[len];
		for(int i = 0; i < len; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		for(int a: arr2) {
			System.out.print(a+"");
		}
		sc.close();
	}

}
