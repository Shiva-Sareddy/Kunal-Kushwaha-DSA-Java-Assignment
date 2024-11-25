package kunalDSA;

import java.util.*;
class DivyaQn103{
    public static void nonPrime(int[] arr){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i: arr){
            hmap.put(i,hmap.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            if(entry.getValue() <= 1 && !(prime(entry.getKey()))){
                System.out.println(entry.getKey());
            }
        }
    }
    
    public static boolean prime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        nonPrime(arr);
        sc.close();
    }
}
