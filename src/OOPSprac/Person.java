package OOPSprac;

import java.util.Date;

public class Person {
	private String name = null;
	private Date dob = null;
	private String address = null;
	public static  int age = 25;//for class modifier public setter and getter methods are not important.They can be called directly by class name and method name

	public String getName() { // getter for name
		return name;
	}

	public void setName(String name) { // setter for name
		this.name = name;
	}

	public Date getDob() { // getter for dob
		return dob;
	}

	public void setDob(Date dob) { // setter for dob
		this.dob = dob;
	}

	public String getaddress() { // getter for address
		return address;
	}

	public void setAddress(String address) { // setter for address
		this.address = address;
	//}

	//public int getAge() {
		//return age;
	//}
	//public void setAge(int age){
		//this.age=age;
	}
}


