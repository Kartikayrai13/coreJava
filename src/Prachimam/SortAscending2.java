package Prachimam;

public class SortAscending2 {
	public static void main(String[] args) {
		int[] abc = { 23, 354, 165, 64, 698, 89 };
		System.out.println("Acending order=");
		for (int i = 0; i < abc.length; i++) {
			for (int j = i + 1; j < abc.length; j++) {
				int a = 0;
				if (abc[i] > abc[j]) {
					a = abc[i];
					abc[i] = abc[j];
					abc[j] = a;
				}
			}
			System.out.print(abc[i] + " ");
		}
	}
}
