package kunalDSA;

import java.util.*;
class DivyaQn102 {
    public static void unique(int[] arr){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i: arr){
            hmap.put(i, hmap.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            if(entry.getValue() <= 1){
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        unique(arr);
        sc.close();
    }
}
