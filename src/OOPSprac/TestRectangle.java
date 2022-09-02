package OOPSprac;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setColor("white");
		r.setBorderWidth(4);
		r.setLength(12);
		r.setWidth(12);

		double x = r.area();
		System.out.println("Area of Rectangle:" + x);
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());

		Triangle t = new Triangle();
		t.setBase(2);
		t.setHeight(5);
		double y = t.area();
		System.out.println("Area of Triangle:" + y);

		Circle c = new Circle();
		c.setRadius(9);
		double z = c.area();
		System.out.println("Area of circle:" + z);
	}

}
