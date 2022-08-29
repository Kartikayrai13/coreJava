package Excercise4_14;

public class Q14Average {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int i;
		int count1 = 0;
		int count2 = 0;
		for (i = 2; i <= 10; i += 2) {
			sum1 = sum1 + i;
			count1++;
		}
		System.out.println("Average of even numbers:-" + sum1 / count1);
		for (int j = 1; j <= 10; j += 2) {
			sum2 = sum2 + j;
			count2++;
		}
		System.out.println("Average of odd numbers:-" + sum2 / count2);

	}
}
