package kunalDSA;

import java.util.Scanner;

public class DivyaQn99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = sc.nextLine().split(" ");
		for(int i = 0; i < word.length; i++) {
			for(int j = word[i].length()-1; j >= 0; j--) {
				System.out.print(word[i].charAt(j));
			}
			System.out.print(" ");
		}
		sc.close();

	}

}
