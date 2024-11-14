package kunalDSA;

import java.util.Scanner;

public class DivyaQn84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String letters = word.replaceAll("[0-9]", "");
		String[] nums = word.replaceAll("[A-Za-z\\W+]", "").split("");
		
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + Integer.valueOf(nums[i]);
		}
		
		System.out.println(letters + sum);
		sc.close();
	}
}
