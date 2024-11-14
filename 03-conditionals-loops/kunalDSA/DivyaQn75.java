package kunalDSA;

import java.util.Scanner;

public class DivyaQn75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countVowels = 0;
		int countCons = 0;
		int countSpl = 0;
		String input = sc.nextLine().toLowerCase();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
					countVowels += 1;
				}else {
					countCons += 1;
				}
			}
			else{
				countSpl += 1;
			}
			
		}
		System.out.println(countVowels);
		System.out.println(countCons);
		System.out.println(countSpl);
		sc.close();

	}

}
