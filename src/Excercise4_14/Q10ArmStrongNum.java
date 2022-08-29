package Excercise4_14;

public class Q10ArmStrongNum {
	public static void main(String[] args) {
		int num = 153;
		int r;
		int sum = 0;
		int n = num;
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("Number is an armstrong number.");
		} else {
			System.out.println("Number is not an armstrong number.");
		}

	}
}
