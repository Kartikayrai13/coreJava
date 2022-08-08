
public class Primeprac3 {
	public static void main(String[] args) {
		int num = 11;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				System.out.println("number is not prime");
				break;
			}

		}
		if (count == 0) {
			System.out.println("number is prime");
		}
	}
}
