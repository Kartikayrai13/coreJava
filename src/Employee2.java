package OOPPrachiMam;

public class Employee2 extends Perosn3 {
	public Employee2(String fn, String ln, String add) {
		super(fn, ln);
		address = add;
		System.out.println("Constructor with 3 paramereters");

	}
	public static void main(String[] args) {
		Employee2 e=new Employee2("Kartikay", "Rai","Indore");
		System.out.println("Name:-"+e.firstName+" "+e.lastName);
		System.out.println("Address:-"+e.address);
		
	}
}
