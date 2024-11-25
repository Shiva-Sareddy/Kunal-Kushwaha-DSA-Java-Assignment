package kunalDSA;

import java.util.Scanner;

public class DivyaQn93 {
	public static String strNum(String word) {
		String w = "";
		String n = "";
		for(int i = 0; i < word.length(); i++) {
			if(Character.isLetter(word.charAt(i))) {
				w = w + word.charAt(i);
			}else if(Character.isDigit(word.charAt(i))) {
				n = n + word.charAt(i);
			}
		}
		return w + n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(strNum(word));
		sc.close();

	}

}
