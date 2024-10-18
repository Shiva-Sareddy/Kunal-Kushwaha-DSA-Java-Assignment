package kunalDSA;

import java.util.Scanner;

public class DivyaQn31 {

	public static int[] findSecondSmallest(int[] arr) {
		int n = arr.length;
		int[] arr2 = new int[n/2];
        int index = 0;
        for (int i = 1; i < arr.length; i += 2) {
            arr2[index++] = arr[i];
        }
        return arr2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] res = findSecondSmallest(arr);
		for(int e: res) {
			System.out.print(e + " ");
		}
		sc.close();
	}
}
