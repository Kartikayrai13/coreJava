package OOPPrachiMam;

public class Employee1 extends Person2{
	protected String name;
	protected String address;
	protected String id;
	
	public Employee1() {
		System.out.println("Calling default constructor");
	}
	public Employee1(String name, String address,String id){
		super(name, address);
		System.out.println("Parameterized constructor calling" );
		this.id=id;
	}
	public String getId(){
		return id;
	}
}

