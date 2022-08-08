package RaysPrac;

public class Primeprac2 {
	public static void main(String[] args) {
		int num = 7;
		int sum = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				sum++;
				break;
			}
		}
		if (sum == 0) {
			System.out.println("number is not prime");
		} else {
			System.out.println("number is prime");
		}
	}
}
