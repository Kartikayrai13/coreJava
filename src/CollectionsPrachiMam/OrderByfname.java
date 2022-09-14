package CollectionsPrachiMam;
import java.util.*;
public class OrderByfname {
public static void main(String[] args) {
	Marksheet1 m5=new Marksheet1();
	m5.setRollNo("101");
	m5.setFname("Kartikay");
	m5.setLname("Rai");
	m5.setPhys(70);
	m5.setChem(76);
	m5.setMaths(80);
	
	Marksheet1 m1=new Marksheet1();
	m1.setRollNo("104");
	m1.setFname("Aman");
	m1.setLname("Sahu");
	m1.setPhys(72);
	m1.setChem(86);
	m1.setMaths(50);
	
	Marksheet1 m2=new Marksheet1();
	m2.setRollNo("103");
	m2.setFname("Harish");
	m2.setLname("Hamad");
	m2.setPhys(62);
	m2.setChem(66);
	m2.setMaths(70);
	
	Marksheet1 m3=new Marksheet1();
	m3.setRollNo("102");
	m3.setFname("Neeraj");
	m3.setLname("Rathore");
	m3.setPhys(72);
	m3.setChem(66);
	m3.setMaths(80);
	
	ArrayList l=new ArrayList();
	l.add(m5);
	l.add(m1);
	l.add(m2);
	l.add(m3);
	 Collections.sort(l);
	 
}
}
