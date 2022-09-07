package OOPPrachiMam;

public class Person1 {
	protected String firstName;
	protected String lastName;
	protected String address;

	public Person1() {
		System.out.println("Print default constructor");
	}

	public Person1(String fn, String ln) {
		//this();//calling default constructor it will also print
		firstName = fn;
		lastName = ln;
		System.out.println("Constructors with 2 parameters");
	}
	public Person1(String fn, String ln, String add){
		this(fn,ln);//calling constructor with 2 parameters
		address=add;
		System.out.println("Contrctuctor with 3 parameters ");
	}
	public static void main(String[] args) {
		Person1 p=new Person1("Kartikay","Rai","Indore");
		System.out.println("Name:-"+p.firstName+" "+p.lastName);
		System.out.println("Address:-"+p.address);
		
	}
}
