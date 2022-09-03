package OOPPrachiMam;
public class ExPolyOverridding {
	public static void main(String[] args) {
		Shape s=new Rectangle1(12,12);
		Shape s1=new Triangle1(12,11);
		Shape s2=new Circle1(3);
		double x=s.area();
		System.out.println(x);
		double y=s1.area();
		System.out.println(y);
		double z=s2.area();
		System.out.println(z);
		
		
	}
}
 