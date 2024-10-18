package kunalDSA;

import java.util.Scanner;

public class DivyaQn06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
		int len = word.length();
		
		boolean isPalindrome = true;
		
		for(int i = 0; i < len/2; i++) {
			if(word.charAt(i) != word.charAt(len-i-1)) {
				isPalindrome = false;
			}
		}
		if(isPalindrome) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();

	}

}
