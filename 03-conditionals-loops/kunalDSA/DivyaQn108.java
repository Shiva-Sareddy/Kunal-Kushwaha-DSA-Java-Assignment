package kunalDSA;

import java.util.Scanner;

public class DivyaQn108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = Math.max(a, Math.max(b, c));
		System.out.println(res);
		sc.close();

	}

}
