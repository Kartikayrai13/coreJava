package Inheritance;

public class Constructorsarray {
	public static void main(String[] args) {
		Shape[]s=new Shape[3];
		s[0]=new Rectangle(10,10);
		s[1]=new Triangle(12,12);
		s[2]=new Circle(5);
	}

}
