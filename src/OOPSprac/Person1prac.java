package OOPSprac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person1prac {
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		p.setName("Kartikay");
		System.out.println(p.getName());
		p.setAddress("cm 2nd 571");
		System.out.println(p.getaddress());
		String s = "09/01/1997";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		p.setDob(d);
		Date d1 = p.getDob();
		System.out.println(d1);
		System.out.println(Person.age);
		
	}
}
