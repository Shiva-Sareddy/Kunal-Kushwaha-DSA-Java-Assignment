package kunalDSA;


import java.util.Scanner;

public class DivyaQn4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[n];
		System.arraycopy(arr, p, arr2, 0, n-p);
		System.arraycopy(arr, 0, arr2, n-p, p);
		for(int i: arr2) {
			System.out.print(i + " ");
		}
		sc.close();

	}

}
