package OOPPrachiMam;

public class ExShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address();
		a.setStreet("Vijaynagar");
		a.setCity("Indore");
		a.setState("MP");
		Employee e = new Employee();
		e.setId("1");
		e.setFname("Ram");
		e.setLname("Jain");
		e.setAddr(a);
		Employee e1=(Employee) e.clone();
		System.out.println(e1.getId());
		System.out.println(e1.getFname());
		System.out.println(e1.getLname());
		System.out.println(e1.getAddr().getStreet());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getState());
	
		

	}
}
