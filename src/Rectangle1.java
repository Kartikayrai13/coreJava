package OOPPrachiMam;

public class Rectangle1 extends Shape {
	
	private int length;
	private int width;

	public Rectangle1() {
	}

	public Rectangle1(int l, int w) {
		length=l;
		width=w;
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}
		
		public double area() {
		double total = length * width;
		System.out.println("Area of Rectangle:-");
		return total;

	}

}


