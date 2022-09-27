package ExceptionPrachiMam;

public class Ex3 {
	public static void main(String[] args) {
		try {
			double d = 15 / 0;
			System.out.println("Try block attempted");
			System.out.println(d);
		} catch (ArithmeticException a) {
			System.out.println("Number cannot be divided by zero");
			System.exit(1);
		} finally {
			System.out.println("Finally block attempted");
		}
	}
}

