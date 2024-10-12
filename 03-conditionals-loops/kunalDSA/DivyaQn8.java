package kunalDSA;

import java.util.Scanner;

public class DivyaQn8 {
	private static String reverseString(String s) {
		int len = s.length();
		String newWord = "";
		for(int i = len-1; i >= 0; i--) {
			newWord = newWord + s.charAt(i);
		}
		return newWord;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(reverseString(word));
		sc.close();

	}

}
