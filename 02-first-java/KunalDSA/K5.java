package KunalDSA;

import java.util.Scanner;

public class K5 {
	public static void main(String[] args) {
        // Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two number(ex: 20 4): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m) {
            System.out.println("First number is greater than Second number");
        } else if (m > n) {
            System.out.println("Second number is greater than First number");
        } else {
            System.out.println("Whoops. Entered Same :(");
        }
        sc.close();
    }
}
