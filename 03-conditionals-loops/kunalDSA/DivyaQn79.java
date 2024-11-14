package kunalDSA;

import java.util.Scanner;

public class DivyaQn79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String newWord = "";
		for(int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				newWord += Character.toLowerCase(word.charAt(i));
			}else if(Character.isLowerCase(word.charAt(i))) {
				newWord += Character.toUpperCase(word.charAt(i));
			}
		}
		System.out.println(newWord);
		sc.close();

	}

}
