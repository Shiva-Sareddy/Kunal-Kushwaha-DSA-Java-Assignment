package kunalDSA;
import java.util.Scanner;
public class DivyaQn92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		boolean res = true;
		for(int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			boolean found = false;
			for(int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) == c) {
					found = true;
				}
			}
			if(!found) {
				res = false;
//				break;
			}
		}
		if(res) {   
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}