package kunalDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class DivyaQn36 {

	public static ArrayList<Integer> findSecondSmallest(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	if(arr[i]%2 != 0) {
        		arr2.add(arr[i]);
        	}
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
		
		ArrayList<Integer> res = findSecondSmallest(arr);
		for(int e: res) {
			System.out.print(e + " ");
		}
		sc.close();
	}

}
