package KunalDSA;
import java.util.Scanner;
public class K1 {
	public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find Even or Odd: ");
        long num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("You entered Even number");
        } else {
            System.out.println("You entered Odd number");
        }
        sc.close();
    }
}
