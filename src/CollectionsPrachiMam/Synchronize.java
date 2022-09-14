package CollectionsPrachiMam;

import java.util.ArrayList;
import java.util.*;
public class Synchronize {
	public static void main(String[] args) {
	//List l=new ArrayList<>();
	//Stack l=new Stack();
	Vector l=new Vector(15,13);//capacity and size can be predefined  
	l.add(12);
	l.add(23);
	l.add(34);
	l.add(12);
	l.add(23);
	l.add(34);
	l.add(12);
	l.add(23);
	l.add(34);
	l.add(12);
	l.add(23);
	l.add(34);
	
	System.out.println(l.capacity());//capacity increases by double from size
	System.out.println(l.size());
	//Enumeration e=l.elements();//only works with Stack l=new Stack(); and not list in place of Stack
	//while (e.hasMoreElements()) {
		//Object object = (Object) e.nextElement();
		//System.out.println(object);
	}
	//System.out.println(l);
	//List syncList=Collections.synchronizedList(l);//to convert asynchronous to synchronous
	//System.out.println(syncList);
	
	}

//}
