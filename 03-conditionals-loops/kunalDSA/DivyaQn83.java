package kunalDSA;

import java.util.Scanner;

public class DivyaQn83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0;
		while ( n > counter) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			long phone = sc.nextLong();
			sc.nextLine();
			String address = sc.nextLine();
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(address);
			counter++;
		}
		sc.close();

	}

}
