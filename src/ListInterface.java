package CollectionsPrachiMam;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(0, 22);
		l.add(1, 'g');
		l.add(2, "Vijay");
		//l.get(2);
		//l.remove(1);
		//l.set(2, "King");
		//l.indexOf(22);
		//l.lastIndexOf("Vijay");
		//l.subList(1,2);
		l.add(null);
		l.add(3, null);
		
		System.out.println(l);
	}
}
