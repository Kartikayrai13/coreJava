package CollectionsPrachiMam;
import java.util.*;
import java.util.ArrayList;

public class TestMarksheet2 {
public static void main(String[] args) {
	Marksheet2 m5=new Marksheet2();
	m5.setRollNo("101");
	m5.setFname("Kartikay");
	m5.setLname("Rai");
	m5.setPhys(70);
	m5.setChem(76);
	m5.setMaths(80);
	
	Marksheet2 m1=new Marksheet2();
	m1.setRollNo("104");
	m1.setFname("Aman");
	m1.setLname("Sahu");
	m1.setPhys(72);
	m1.setChem(86);
	m1.setMaths(50);
	
	Marksheet2 m2=new Marksheet2();
	m2.setRollNo("103");
	m2.setFname("Harish");
	m2.setLname("Hamad");
	m2.setPhys(62);
	m2.setChem(66);
	m2.setMaths(70);
	
	Marksheet2 m3=new Marksheet2();
	m3.setRollNo("102");
	m3.setFname("Neeraj");
	m3.setLname("Rathore");
	m3.setPhys(72);
	m3.setChem(66);
	m3.setMaths(80);
	
	ArrayList l=new ArrayList();
	l.add(m5);
	l.add(m1);
	l.add(m3);
	l.add(m2);
	
	Marksheet2 mk=new Marksheet2();
	Collections.sort(l, mk);
	Iterator it=l.iterator();
	while (it.hasNext()) {
		Marksheet2 km = (Marksheet2) it.next();
		System.out.println(km.getRollNo()+" "+km.getFname()+" "+km.getLname()+" "+km.getPhys()+" "+km.getChem()+" "+km.getMaths());
		
		
	}
	
}
}
