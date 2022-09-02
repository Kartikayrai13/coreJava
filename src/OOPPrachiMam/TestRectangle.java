package OOPPrachiMam;

public class TestRectangle {
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
	
}
}
