package kunalDSA;

import java.util.Scanner;

public class DivyaQn32 {
	public static int findSecondSmallest(int[] arr) {
		int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i ++) {
            if(arr[i] % 2 != 0) {
            	sum = sum + arr[i];
            }
        }
        return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = findSecondSmallest(arr);
		System.out.print(res);
		sc.close();
	}
}
