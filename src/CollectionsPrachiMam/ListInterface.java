package CollectionsPrachiMam;
import java.util.*;
//import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		//List l=new ArrayList();
		Stack l=new Stack();
		l.add(12);
		l.add('t');
		l.add("Vijay");
		l.add(2.5);
		//l.push(12);//add elements in stack
		l.pop();//follows last in first out
		//l.peek();gives last element from list
		//System.out.println(l.peek());
		//l.add(0, 22);
		//l.add(1, 'g');
		//l.add(2, "Vijay");
		//l.get(2);
		//l.remove(1);
		//l.set(2, "King");
		//l.indexOf(22);
		//l.lastIndexOf("Vijay");
		//l.subList(1,2);
		//l.add(null);
		//l.add(3, null);
		List l1=new ArrayList<>();
		l1.add(23);
		l1.add('t');
		l1.add("Ajay");
		l1.add(3.5);
		System.out.println(l1);
		l.retainAll(l1);//compares the two list and gives the common elements
		//Iterator it=l.listIterator();//for previous iterator but not working
		//Iterator it=l.iterator();//works like loop with while iterator
		
		//while (it.hasNext()) {//hasPrevious method in iterator for reverse order but not working 
			
			//Object object = (Object) it.next();
		//Collections.reverse(l);
		System.out.println(l);
		}
	}
//}
//while (it.hasPrevious()) {//hasPrevious method in iterator for reverse order but not working 

//Object object = (Object) it.Previous();

//System.out.println(l);
