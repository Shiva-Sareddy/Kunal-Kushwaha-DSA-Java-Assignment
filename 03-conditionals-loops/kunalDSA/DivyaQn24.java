package kunalDSA;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;

public class DivyaQn24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//		HashSet<Integer> hset1 = new HashSet<>();
//		HashSet<Integer> hset2 = new HashSet<>();
//		
//		for(int i = 0; i < n; i++) {
//			if(hset1.contains(arr[i])) {
//				hset2.add(arr[i]);
//			}else {
//				hset1.add(arr[i]);
//			}
//		}
//		ArrayList<Integer> arr2 = new ArrayList<>(hset2);
		
		Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i] == arr[i+1]) {
            	System.out.print(arr[i] + " ");
            }
        }
        
		
		sc.close();

	}

}