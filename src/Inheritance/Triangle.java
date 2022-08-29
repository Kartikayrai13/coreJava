package Inheritance;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle() {

	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		System.out.println("Area of Triangle="+(base*height)/2);
	}

	public int base() {
		return base;
	}

	public void setbase(int base) {
		this.base = base;
	}

	public int height() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public double area() {
		int total = base * height / 2;
		System.out.println("area of triangle=" + total);
		return total;
	}
}
