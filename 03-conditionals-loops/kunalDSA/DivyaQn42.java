package kunalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class DivyaQn42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // Sort the array
        int small = -1;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                small = arr[i];
                break;
            }
        }
        System.out.println(small);
        
		sc.close();
	}
}
