package kunalDSA;

import java.util.Scanner;

public class DivyaQn17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine().toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
		String str2 = sc.nextLine().toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
		int len1 = str1.length();
		int len2 = str2.length();
		String word = "";
		if(len1 == len2) {
			for(int i = 0; i < len1; i++) {
				for(int j = 0; j < len1; j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						word = word + str1.charAt(i);
						break;
					}
				}
			}
		}
//		System.out.println(word);
		if(word.equals(str1)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
		sc.close();
	}
}
