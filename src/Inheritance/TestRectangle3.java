package Inheritance;

public class TestRectangle3 {
	public static void main(String[] args) {
		Shape[] s=new Shape[3];
		s[0]=new Rectangle();
		s[1]=new Triangle();
		s[2]=new Circle();
		
		Rectangle r=(Rectangle) s[0];
		r.setLength(12);
		r.setWidth(12);
		
		Triangle t= (Triangle) s[1];
		t.setbase(11);
		t.setheight(11);
		
		Circle c=(Circle) s[2];
		c.setradius(5);
		
		double totalArea=0;
		for(int i=0;i<s.length;i++){
			totalArea=totalArea+s[i].area();
		}
		
		
		
		
	}
}
