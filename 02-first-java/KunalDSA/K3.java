package KunalDSA;
import java.util.Scanner;
public class K3 {
	public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Calculate Simple Interest --");
        System.out.print("Enter Principal amount (numbers): ");
        float p = sc.nextFloat();
        System.out.print("Enter Time (duration in years): ");
        float t = sc.nextFloat();
        System.out.print("Enter Intrest Rate: ");
        float r = sc.nextFloat();

        // calculation:
        float cal = (p * t * r) / 100;
        System.out.println("The simple intrest is: " + cal);
        sc.close();
    }
}
