package kunalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class DivyaQn35 {

	public static int findSecondSmallest(int[] arr) {
		int n = arr.length;
        Arrays.sort(arr);
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
        	if(arr[i] < small) {
        		small = arr[i+1];
        	}else {
        		small = -1;
        	}
        }
        return small;
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
