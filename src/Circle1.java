package OOPPrachiMam;

public class Circle1 extends Shape {
	private int radius;
	public final double pi = 3.14;

	public Circle1() {
	}

	public Circle1(int r) {
		radius = r;
	}

	public int radius() {
		return radius;
	}

	public double area() {
		double total = pi * (radius * radius);
		System.out.println("Area of Circle:-");
		return total;
	}
}
