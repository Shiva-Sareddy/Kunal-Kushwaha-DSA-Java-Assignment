package kunalDSA;

import java.util.Scanner;

public class DivyaQn38 {

	public static int[] findSecondSmallest(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before Swapping: ");
		for(int b: arr) {
			System.out.print(b + " ");
		}
		System.out.println();
		int[] res = findSecondSmallest(arr);
		System.out.println("After Swapping: ");
		for(int a: res) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
