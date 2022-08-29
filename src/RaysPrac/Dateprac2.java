
package RaysPrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateprac2 {
	public static void main(String[]args) throws ParseException{
		String s="09/01/1997";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		Date d=sdf.parse(s);
		System.out.println(d);
		
		
	}
}
