package kunalDSA;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DivyaQn11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
//		int count = 0;
//		for(int i = 0; i < n; i++) {
//			for(int j = i+1; j < n; j++) {
//				if(arr[i] == arr[j] & arr[i] == k && arr[j] == k) {
//					count = count + 1;
//				}
//			}
//		}
		
		ArrayList<Integer> arrList= new ArrayList<>();
		for (int i : arr) {
            arrList.add(i);
        }
		int frequency = Collections.frequency(arrList, (Integer)k);
		System.out.println(frequency);
		
//		System.out.println(count);
		sc.close();

	}

}
