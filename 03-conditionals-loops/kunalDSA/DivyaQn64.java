package kunalDSA;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class DivyaQn64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (a[i] == b[j]) {
            	if(a[i]%2 == 0) {
            		arr.add(a[i]);
            	}
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        if(arr.isEmpty()) {
        	System.out.println("No elements found");
        }else {
        	for (int el : arr) {
                System.out.print(el + " ");
            }
        }
    }
}
