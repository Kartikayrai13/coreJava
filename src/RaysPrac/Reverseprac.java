package RaysPrac;

public class Reverseprac {
	public static void main(String[] args) {
		int num = 742;
		int r;
		int sum = 0;
		int n = num;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("Reverse of the number:" + sum);
		} else {
			System.out.println("Number is not an Palindrome number:" + sum);
		}

	}

}
