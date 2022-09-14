package CollectionsPrachiMam;

import java.util.ArrayList;
import java.util.*;
public class TestMarksheet {
	public static void main(String[] args) {
		ArrayList m=new ArrayList();
		m.add(new Marksheet("A4","Sakshi",89));
		m.add(new Marksheet("A2","Sindhu",90));
		m.add(new Marksheet("A3","Sania",90));
		Collections.sort(m);
		for (Object object : m) {
			System.out.println(object);
			
		}
			
		}
	}


