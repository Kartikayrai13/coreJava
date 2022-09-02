package OOPSprac;

public class Circle extends Shape {
 private int radius;
 public final float pi=3.14f;
 
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
 public double area(){
	 double c=pi*radius*radius;
	 return c;
 }
}
