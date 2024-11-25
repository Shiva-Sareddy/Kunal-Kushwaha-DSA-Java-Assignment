package kunalDSA;

import java.util.Scanner;

public class DivyaQn90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int count = 0;
		for(int i = 0; i <= str1.length() - str2.length(); i++) {
			if(str1.substring(i,str2.length()+i).equals(str2)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}

}
