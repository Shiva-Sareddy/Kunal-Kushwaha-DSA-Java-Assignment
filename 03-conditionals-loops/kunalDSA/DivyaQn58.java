package kunalDSA;

import java.util.Scanner;

public class DivyaQn58 {
    public static boolean isPrime(int sum) {
        if (sum <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (isPrime(sum)) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

        sc.close();
    }
}
