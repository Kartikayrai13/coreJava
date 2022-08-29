package Inheritance;

public class TestRectangle {
	public static void main(String[]args){
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c= new Circle();
		//Shape s=new Rectangle();
		r.setLength(12);
		r.setWidth(23);
		t.setbase(10);
		t.setheight(12);
		r.area();
		t.area();
		c.setradius(11);
		c.pi();
		c.area();
		
		}
	}

