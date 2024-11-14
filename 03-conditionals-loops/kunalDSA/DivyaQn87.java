package kunalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class DivyaQn87 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] charArr = word.toCharArray();
		Arrays.sort(charArr);
		for(char i: charArr) {
			System.out.print(i+"");
		}
		sc.close();

	}

}
