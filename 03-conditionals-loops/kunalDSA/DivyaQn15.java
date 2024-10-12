package kunalDSA;

import java.util.Scanner;

public class DivyaQn15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String ch1 = sc.next();
		String ch2 = sc.next();
		String newWord = word.replaceAll(ch1, ch2);
		System.out.println(newWord);
		sc.close();

	}

}
