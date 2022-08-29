
package Excercise4_14;

public class Q11PrimeNum {
	public static void main(String[] args) {
		int num = 12, temp = 0;
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				temp++;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Number is a prime number.");
		} else {
			System.out.println("Number is not a prime number.");
		}
	}
}
