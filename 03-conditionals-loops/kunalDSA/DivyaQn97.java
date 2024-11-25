package kunalDSA;

import java.util.Scanner;

public class DivyaQn97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = sc.nextLine().split(" ");
		for(int i = 0; i < word.length - 1; i+=2) {
			String temp = word[i];
			word[i] = word[i+1];
			word[i+1] = temp;
		} 
		for(String i: word) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
