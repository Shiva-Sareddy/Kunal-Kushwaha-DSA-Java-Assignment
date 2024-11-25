package kunalDSA;

import java.util.Scanner;

public class DivyaQn98 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = sc.nextLine().split(" ");
		for(int i = 0; i < word.length; i++) {
			System.out.print(word[i] + word[i].length() + " ");
		}
		sc.close();

	}

}
