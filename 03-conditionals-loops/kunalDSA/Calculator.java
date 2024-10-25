package kunalDSA;
class Calculator1{
	public int add(int a, int b){
		return a + b;
	}
	public double add(double a, double b, double c){
		return a + b + c;
	}
	public float add(float a, float b){
		return a + b;
	}
	public double add(int a, double b) {
		return a + b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
		
		int intSum = cal1.add(5, 10);
		System.out.println("Sum of two ints: " + intSum);
		
		double doubleSum = cal1.add(3.5, 4.5, 5.5);
		System.out.println("Sum of three doubles: " + doubleSum);
		
		float floatSum = cal1.add(3.5f, 2.5f);
		System.out.println("Sum of two floats: " + floatSum);
		
		double intDoubleSum = cal1.add(5, 4.5);
		System.out.println("Sum of one int and one float: " + intDoubleSum);
	}

}
