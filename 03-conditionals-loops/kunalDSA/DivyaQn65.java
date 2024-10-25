package kunalDSA;

import java.util.Scanner;

public class DivyaQn65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[]arr1 = new int[a];
		for(int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int[] arr2 = new int[b];
		for(int i = 0; i < b; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] res = mergeArray(arr1, arr2);
		System.out.print("Merged array: ");
		for(int el : res) {
			System.out.print(el + " ");
		}
		sc.close();

	}
	
	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		for(int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			newArr[arr1.length + i] = arr2[i];
		}
		return newArr;
	}

}
