package RaysPrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateprac3 {
	public static void main (String []args) throws ParseException{
	Date d= new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal=Calendar.getInstance();
	cal.setTime(d);
	for(int i=1;i<=12;i++){
	cal.add(Calendar.DATE,10);
	Date Today=cal.getTime();
	String s=sdf.format(Today);
	System.out.println(s);
	
	}
	}
}


			
			
	