
public class Wholenumber {
	public static void main(String[] args) {
		int i = 100;
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