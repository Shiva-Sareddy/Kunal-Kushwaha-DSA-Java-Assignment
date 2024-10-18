package kunalDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DivyaQn25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		ArrayList<Integer> res = duplicateElements(arr);
		for(int num: res) {
			System.out.print(num + " ");
		}
	}
	
	public static ArrayList<Integer> duplicateElements(int[] arr) {
		Arrays.sort(arr);
		ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i] == arr[i+1]) {
            	arr2.add(arr[i]);
            }
        }
		return arr2;
	}
}
