package CollectionsPrachiMam;
import java.util.*;
public class TestEmployee {
public static void main(String[] args) {
	Employee e= new Employee();
	e.setFname("Aman");
	e.setLname("Gupta");
	e.setId(1234);
	
	Employee e1= new Employee();
	e1.setFname("Harish");
	e1.setLname("Gupta");
	e1.setId(1235);
	
	Employee e2= new Employee();
	e2.setFname("Shivam");
	e2.setLname("Gupta");
	e2.setId(1236);
	
	Employee e3= new Employee();
	e3.setFname("Neeraj");
	e3.setLname("Gupta");
	e3.setId(1237);
	
	ArrayList l=new ArrayList();
	l.add(e);
	l.add(e1);
	l.add(e2);
	l.add(e3);
	
	
	SortByName o1=new SortByName();
	Collections.sort(l,o1);
	
	SortByLastName o2=new SortByLastName();
	Collections.sort(l, o2);
	
	
	Iterator it =l.iterator();
	while (it.hasNext()) {
		Employee o = (Employee) it.next();
		System.out.println(o.getFname()+" "+o.getLname()+" "+o.getId());
		
	}
	
	
}
}
