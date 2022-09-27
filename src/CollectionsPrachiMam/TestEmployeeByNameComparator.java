package CollectionsPrachiMam;

import java.util.*;

public class TestEmployeeByNameComparator {
public static void main(String[] args) {
	Employee e= new Employee();
	e.setFname("Shubham");
	e.setLname("Sahu");
	e.setId(1234);
	
	Employee e1= new Employee();
	e1.setFname("Aman");
	e1.setLname("Hamad");
	e1.setId(1235);
	
	Employee e2= new Employee();
	e2.setFname("Aman");
	e2.setLname("Gupta");
	e2.setId(1236);
	
	Employee e3= new Employee();
	e3.setFname("Shubham");
	e3.setLname("Rathore");
	e3.setId(1237);
	
	ArrayList l=new ArrayList();
	l.add(e);
	l.add(e1);
	l.add(e2);
	l.add(e3);
	
	EmployeeByNameComparator o1=new EmployeeByNameComparator();
	Collections.sort(l, o1);
	
	Iterator it=l.iterator();
	while (it.hasNext()) {
		Employee o = (Employee) it.next();
		System.out.println(o.getFname()+" "+o.getLname()+" "+o.getId());
	}
}
}
