
package Excercise4_14;

public class Q7SumOfIntegers {
	public static void main(String[] args) {
		int i = 101;
		int sum = 0;
		while (i < 201) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;
			sum = sum + i;
		}
		System.out.println("Total:" + sum);
	}
}

