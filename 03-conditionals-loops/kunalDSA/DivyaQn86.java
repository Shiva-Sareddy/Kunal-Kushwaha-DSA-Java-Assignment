package kunalDSA;

import java.util.Scanner;

public class DivyaQn86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if(sb.indexOf(String.valueOf(c)) == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		sc.close();

	}

}
