package KunalDSA;
import java.util.Scanner;
public class K4 {
	public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two numbers with space: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter an Operator('+','-','*','/'): ");
        String o = sc.nextLine();
        if (o.equals("+")) {
            System.out.println(n + "+" + m + " = " + (n + m));
        } else if (o.equals("-")) {
            System.out.println(n + "-" + m + " = " + (n - m));
        } else if (o.equals("*")) {
            System.out.println(n + "*" + m + " = " + ((float) n * m));
        } else if (o.equals("/")) {
            System.out.println(n + "/" + m + " = " + ((float) n / m));
        } else {
            System.out.println("Whoops! Entered Wrong Operator :( ");
        }
        sc.close();
    }
}
