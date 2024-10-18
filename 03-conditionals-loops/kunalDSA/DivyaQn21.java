package kunalDSA;

import java.util.Scanner;

public class DivyaQn21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String op = sc.nextLine();
		int res = 0;
		int i1 = Integer.parseInt(s1,2);
		int i2 = Integer.parseInt(s2,2);
		if(op.equalsIgnoreCase("AND")) {
			res = i1 & i2;
		}else if(op.equalsIgnoreCase("OR")){
			res = i1 | i2;
		}else if(op.equalsIgnoreCase("XOR")){
			res = i1 ^ i2;
		}
		String binary = Integer.toBinaryString(res);
		System.out.println(binary);
		sc.close();
	}

}
