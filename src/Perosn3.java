package OOPPrachiMam;

public class Perosn3 {
	protected String firstName;
	protected String lastName;
	protected String address;

	public Perosn3() {
		System.out.println("Default Constructor");
	}

	public Perosn3(String fn, String ln) {
		this();// calling constructor
		firstName = fn;
		lastName = ln;
		System.out.println("Constructor of person3 with 2 parameters");

	}

}
