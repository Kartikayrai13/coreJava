package Excercise4_14;

public class Q17MissingElement {
	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 9, 4, 7 };
		int[] b = { 1, 3, 6, 9, 4 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			sum2 = sum2 + b[j];
		}
		System.out.println("Missing element:" + (sum1 - sum2));

	}

}
