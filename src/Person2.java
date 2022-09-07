package OOPPrachiMam;

public class Person2 {
	protected String name;
	protected String address;
	public Person2() {
	}
	public Person2(String name,String address){
		this();
		this.name=name;
		this.address=address;
		System.out.println("Parameterrized constructor of person2");
	}
	public String getName(){//getter
		return name;
	}
	public String getAddress(){//getter
		return address;
	}

}
