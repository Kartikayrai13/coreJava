
public class Fibocodeprac1 {
	public static void main(String[] args) {
		int n = 10;
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println("fibonacci series till" + n + "numbers:");
		for (int i = 1; i <= n; i++) {
			System.out.print(firstNumber + ",");
			int nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;

		}
	}
}
