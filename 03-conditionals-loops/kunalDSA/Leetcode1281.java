package kunalDSA;

import java.util.Scanner;

public class Leetcode1281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;        
		String convertedNum = Integer.toString(num);
		int len = convertedNum.length();
		int res = 0;
		if(num>0){
			for(int i = 0; i < len; i++ ) {
				int nums = (int) Character.getNumericValue(convertedNum.charAt(i));
				sum = sum + nums;
				product = product * nums;
				res = (int) (product - sum);
			}
		}else {
			for(int i = 1; i < len; i++ ) {
				int nums = (int) Character.getNumericValue(convertedNum.charAt(i));
				sum = sum + nums;
				product = product * nums;
				res =  -(int) (product - sum);
			}
		}
		System.out.println("Result (Product - Sum): " + res);
		sc.close();
	}

}
