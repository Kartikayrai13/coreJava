
package Excercise4_14;

public class Q3RandomNum {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int r = (int) (Math.random() * 100);
			System.out.print(r + " ");
		}
	}
}
