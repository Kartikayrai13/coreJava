package Inheritance;

public class ArrayShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(12, 12);
		s[1] = new Triangle(12, 12);
		s[2] = new Circle(3);
		// System.out.println(s[0].area());
		// System.out.println(s[1].area());
		// System.out.println(s[2].area());
	 for (int i = 0; i < s.length; i++) {
		 System.out.println(s[i].area());
		//double totalArea = calArea(s);
		//System.out.println("Total Area of all Shape:-"+totalArea);



	}

	//static double calArea(Shape[] s) {
		//double totalArea = 0;
		//for (int i = 0; i < s.length; i++) {
			//totalArea = totalArea + s[i].area();
		//}
		//return totalArea;

	}
}
