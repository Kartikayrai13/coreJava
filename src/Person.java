package OOPPrachiMam;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;

	public Person(){
		
	}

	public Person(String name, Date dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	

	public String getName() { // getter for name
		return name;
	}
	public String getaddress() { // getter for address
		return address;
	}
	public Date getDob() { // getter for dob
		return dob;
	}

}