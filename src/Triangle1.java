package OOPPrachiMam;

public class Triangle1 extends Shape {
	private int base;
	private int height;

	public Triangle1() {

	}

	public Triangle1(int b, int h) {
	   base=b;	
	   height=h;
	}

	public int base() {
		return base;
	}

	public int height() {
		return height;
	}

	public double area() {
		int total = base * height / 2;
		System.out.println("Area of Trinagle:-");
		return total;
	}
}
