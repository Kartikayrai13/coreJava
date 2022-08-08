package RaysPrac;

public class Primeprac {
	public static void main(String[] args) {
		int num = 13, temp = 0;int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				temp++;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("number is a prime number");
		} else {
			System.out.println("not a prime number"+i);
		}
	}
}