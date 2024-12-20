package kunalDSA;
import java.util.Scanner;
public class DivyaQn109 {
	public static void printPrimes(int a, int b) {
		for(int i = a; i<=b; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		printPrimes(a,b);
		sc.close();
	}
}