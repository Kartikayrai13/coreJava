package OOPPrachiMam;

public class ExMethodArgument {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle1();
		s[1] = new Triangle1();
		s[2] = new Circle1();
		double totalArea = calArea(s);
		System.out.println("Total Area of all Shape:-" + totalArea);

	}

	static double calArea(Shape[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		return totalArea;

	}

}