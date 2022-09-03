package OOPPrachiMam;

public class ExPolyArray {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle1(12, 12);
		s[1] = new Triangle1(12, 12);
		s[2] = new Circle1(3);
		// System.out.println(s[0].area());
		// System.out.println(s[1].area());
		// System.out.println(s[2].area());
		for (int i = 0; i < s.length; i++) {
		 System.out.println(s[i].area());
		}
	}
}
		