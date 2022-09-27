package Java8;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*; 
public class Stream2 {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<>();
	m.put(1, "King");
	m.put(2, "Queen");
	m.put(3, "Joker");
	m.put(4, "Spade");
	m.put(5, "Ace");
	m.put(6, "Pack");
	m.put(7, "King");
	m.put(8, "Queen");
	m.put(9, "Joker");
	m.put(10, "Spade");
	m.put(11, "Ace");
	m.put(12, "Pack");
	//Collection<String> values=m.values();//
	//System.out.println(values);
	//values.stream().sorted().distinct().forEach(e->System.out.println(e));
	ArrayList<String> a=new ArrayList<String>(m.values());//storing the values of the map in ArrayList by calling map method values. 
	//ArrayList<Integer> ab=new ArrayList<Integer>(m.keySet());
	//ArrayList a=new ArrayList(m.values());
	//convert ArrayList into stream and performing the operations
	a.stream().sorted().distinct().forEach(e->System.out.println(e));//for values
	//ab.stream().sorted().distinct().forEach(f->System.out.println(f));//for keys

}
}
