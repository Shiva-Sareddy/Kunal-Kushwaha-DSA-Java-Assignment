package kunalDSA;

import java.util.Scanner;

public class DivyaQn77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String newWord = word.replaceAll("a", "*a");
		System.out.println(newWord);
		sc.close();

	}

}
