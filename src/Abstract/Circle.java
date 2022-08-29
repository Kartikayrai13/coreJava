package Abstract;

public abstract class Circle extends Shape {
	private int radius;
	final private double pi = 3.14;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int radius() {
		return radius;
	}

	public void setradius(int radius) {
		this.radius = radius;
	}

	public double pi() {
		return pi;
	}

	// public void setradius(double radius){
	// this.pi= pi;
	// }
	//public double area() {
		//double total = pi * (radius * radius);
		//System.out.println("area of circle=" + total);
		//return total;
	//}
}

//}
