package kunalDSA;

import java.util.Scanner;

public class DivyaQn96 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = sc.nextLine().split(" ");
		String max = word[0];
		for(int i = 0; i<word.length; i++) {
			if(word[i].length() > max.length()) {
				max = word[i];
			}
		}
		System.out.println(max);
		sc.close();

	}

}
