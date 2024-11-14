package kunalDSA;

import java.util.Scanner;

public class DivyaQn78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String newWord = word.replaceAll("[AEIOUaeiou]", "");
		System.out.println(newWord);
		sc.close();

	}

}
