package kunalDSA;

import java.util.Scanner;

public class CommonMultiplesof2Numbers2 {
	public static void commonMultiples(int a, int b, int n) {
		int count = 0;
//		int i = 1;
//		while(count < n) {
//			if(i % a == 0 && i % b == 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//			i++;
//		}
		for(int i = 1; count < n; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		commonMultiples(a, b, n);
		
		sc.close();

	}

}
