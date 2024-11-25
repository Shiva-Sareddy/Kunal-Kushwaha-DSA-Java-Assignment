package kunalDSA;

import java.util.Scanner;

public class DivyaQn106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		float area = (float) (3.142 * r * r);
		System.out.format("%.4f", area);
		sc.close();

	}

}
