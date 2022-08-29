package Excercise4_14;

public class Q5ReverseDigit {
	public static void main(String[] args) {
		int num = 1245;
		int r;
		int sum = 0;
		int n = num;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (sum == num) {

		} else {
			System.out.println("Reverse of the number:" + sum);
		}

	}
}