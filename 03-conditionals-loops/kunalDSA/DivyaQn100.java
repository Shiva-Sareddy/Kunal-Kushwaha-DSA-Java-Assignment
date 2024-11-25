package kunalDSA;

import java.util.*;
public class DivyaQn100
{
    public static void frequent(int[] arr){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i: arr){
            hmap.put(i, hmap.getOrDefault(i, 0)+1);
        }
        int maxOccur = 0;
        int mostFrequent = -1;
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            int element = entry.getKey();
            int occur = entry.getValue();
            if(occur >= maxOccur){
                maxOccur = occur;
                mostFrequent = element;
            }
        }
        System.out.println(mostFrequent);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< n; i++){
		    arr[i] = sc.nextInt();
		}
		frequent(arr);
		sc.close();
	}
}

