package kunalDSA;

import java.util.Scanner;

public class DivyaQn74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] newArr = new int[n];
		int i = 0;
		for(int el: arr) {
			if(el != -1) {
				newArr[i++] = el;
			}
		}
		for(int el: arr) {
			if(el == -1) {
				newArr[i++] = el;
			}
		}
		
		for(int el: newArr) {
			System.out.print(el + " ");
		}
		sc.close();

	}

}
