package kunalDSA;

import java.util.Scanner;

public class DivyaQn94 {
	public static String strNum(String word) {
		boolean w = false;
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
				w = true;
			}else {
				w = false;
				break;
			}
		}
		if(w) {
			return "True";
		}else {
			return "False";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(strNum(word));
		sc.close();

	}

}
