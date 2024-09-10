package KunalDSA;
import java.util.Scanner;
public class K2 {
	public static void main(String[] args) {
        // 2. Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your good Name:");
        String name = sc.nextLine();
        System.out.println("Happy Ganesh Chaturthi to you " + name + " and your family.");
        sc.close();
    }
}
