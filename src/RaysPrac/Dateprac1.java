package RaysPrac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateprac1 {
	public static void main(String[]args){
		Date d=new Date();
		System.out.println();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String s=sdf.format(d);
		System.out.println(s
				);
	}
}
