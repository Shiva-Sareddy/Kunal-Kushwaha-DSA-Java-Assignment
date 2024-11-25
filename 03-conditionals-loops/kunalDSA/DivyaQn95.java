package kunalDSA;

import java.util.Scanner;

public class DivyaQn95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = sc.nextLine().split(" ");
		String min = word[0];
		for(int i = 0; i<word.length; i++) {
			if(word[i].length() < min.length()) {
				min = word[i];
			}
		}
		System.out.println(min);
		sc.close();

	}

}
