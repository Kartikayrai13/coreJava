
public class Whileprac2 {
	public static void main(String[] args) {
		int i = 101;
		int sum = 0;
		while (i < 150) {
			if (i % 8 == 0) {
				System.out.println(i);
			}
			i++;
			sum = sum + i;
		}
		System.out.println("Total:" + sum);
	}
}
