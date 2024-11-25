package kunalDSA;

import java.util.Scanner;

public class DivyaQn105 {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = factorial(n);
		System.out.println(res);
		sc.close();

	}

}
