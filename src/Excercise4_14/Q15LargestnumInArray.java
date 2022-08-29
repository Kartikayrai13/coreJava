
package Excercise4_14;

public class Q15LargestnumInArray {
	public static void main(String[] args) {
		int[] a = { 23, 45, 56, 34, 2, 7 };
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
		int lastelement = a[a.length - 1];
		System.out.println("Last Element=");
		System.out.print(lastelement);

	}
}
