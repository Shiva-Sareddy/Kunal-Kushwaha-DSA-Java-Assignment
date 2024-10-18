package kunalDSA;

import java.util.Scanner;

public class DivyaQn09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pr = 0;
		int cu = 1;
		for(int i = pr; i < n; i++) {
			System.out.print(pr + " ");
			int temp = pr + cu;
			pr = cu;
			cu = temp;
		}
		sc.close();
	}

}
