package CollectionsPrachiMam;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		//Set s= new HashSet(); //no duplicate elements and add elements randomly
		Set s= new LinkedHashSet();//no duplicate elements and follow order in which elements have been inserted
		s.add(12);
		s.add(3.5);
		s.add('g');
		s.add("Vijay");
		s.add(12);
		System.out.println(s);
		s.remove(12);
		System.out.println(s);
		
	}
}
