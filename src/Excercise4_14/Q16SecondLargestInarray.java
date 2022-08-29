package Excercise4_14;

public class Q16SecondLargestInarray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 3, 7 };
		int b;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;

				}
			}
			System.out.println(a[i] + " ");
		}
		int secondlastelement = a[a.length - 2];
		System.out.println("second last element=");
		System.out.print(secondlastelement);

	}
}
