package Inheritance;

public class Testrectangle2 {
	public static void main(String[]args){
		Shape s= new Rectangle();
		s.area();
		Rectangle r=(Rectangle)s;
		s.area();
		r.area();
		s.area();
		r.setLength(12);
		r.setWidth(12);
		r.area();
	}
}
