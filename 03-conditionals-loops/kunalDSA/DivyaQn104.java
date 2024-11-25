package kunalDSA;

import java.util.*;

public class DivyaQn104 {
	public static void evenOdd(int[] arr) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i: arr) {
			hmap.put(i, hmap.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry: hmap.entrySet()) {
			if(isOdd(entry.getValue()) && isEven(entry.getKey())) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static boolean isEven(int n) {
		boolean isEven = false;
		if(n%2==0) {
			isEven = true;
		}else {
			isEven = false;
		}
		return isEven;
	}
	
	public static boolean isOdd(int n) {
		boolean isOdd = false;
		if(n%2 != 0) {
			isOdd = true;
		}else {
			isOdd = false;
		}
		return isOdd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		evenOdd(arr);
		sc.close();
	}
}
