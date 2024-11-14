package kunalDSA;

import java.util.Scanner;

public class DivyaQn81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String alphas = "";
		String digits = "";
		for(int i = 0; i < word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				digits += word.charAt(i);
			}else if(Character.isAlphabetic(word.charAt(i))) {
				alphas += word.charAt(i);
			}
		}
		System.out.println(alphas + digits);
		sc.close();

	}

}
