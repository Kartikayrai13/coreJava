package OOPPrachiMam;

public class TestInheritance {
public static void main(String[] args) {
	Rectangle r= new Rectangle();
	r.setColor("Color of Rectangle:-"+"red");
	r.setBoderwidth(23);
	r.setLength(12);
	r.setWidth(12);
	double x=r.area();
	System.out.println(r.getColor());
	System.out.println("BorderWidth of Rectangle:-"+r.getBoderwidth());
	System.out.println("Area of the Rectangle:-"+x);
	
	Triangle t=new Triangle();
	t.setBase(12);
	t.setHeight(12);
	double y=t.area();
	System.out.println("Area of triangle:-"+y);
	
	Circle c=new Circle();
	c.setRadius(5);
	double z=c.area();
	System.out.println("Area of Circle:-"+z);
			
}
}
