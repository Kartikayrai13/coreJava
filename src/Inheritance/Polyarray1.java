package Inheritance;

public class Polyarray1 {
	public static void main(String []args){
		Shape[] s=new Shape[3];
		s[0]=new Rectangle();
		s[1]=new Triangle();
		s[2]=new Circle();
		
		Rectangle r=(Rectangle) s[0];
		r.setLength(10);
		r.setWidth(9);
		
		Triangle t=(Triangle) s[1];
		t.setbase(15);
		t.setheight(18);
		
		Circle c=(Circle) s[2];
		c.setradius(3);
		
		double totalArea=0;
		for(int i=0;i<s.length;i++){
			totalArea=totalArea+s[i].area();	
			
			}
		
		
		
	}
}
