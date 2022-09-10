package CollectionsPrachiMam;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		Set s= new LinkedHashSet();
		s.add(12);
		s.add(3.5);
		s.add('g');
		s.add("Vijay");
		System.out.println(s);
	}
}
