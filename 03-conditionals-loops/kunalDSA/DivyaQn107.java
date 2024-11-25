package kunalDSA;

import java.util.Scanner;

public class DivyaQn107 {
	public static int hcf(int n,int m) {
		n = Math.abs(n);
		m = Math.abs(m);
		if(m==0) {
			return n;
		}else {
			return hcf(m, n%m);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(hcf(n,m));
		sc.close();
	}

}
