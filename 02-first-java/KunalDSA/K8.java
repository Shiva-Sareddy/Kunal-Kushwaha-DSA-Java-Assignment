package KunalDSA;

import java.util.Scanner;

public class K8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to Know Whether it is Palindrome or not: ");
		String word = sc.nextLine();
		String sWord = word.replaceAll("\\s+", "").toLowerCase(); //Note: "\\s+" represents: "\\s" represents any White space character such as Space, newline, tab, carriage return, form feed. "+" indicates two or more spaces.
		String revWord = "";
		for(int i= sWord.length()-1; i >= 0; i--) {
			revWord = revWord + sWord.charAt(i);
		}
		if (revWord.equals(sWord)) {
			System.out.println("Palimdrone");
		}else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}

}
