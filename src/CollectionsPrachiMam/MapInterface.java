package CollectionsPrachiMam;
import java.util.*;
public class MapInterface {
public static void main(String[] args) {
	Map m=new HashMap<>();
	m.put(1, "Kartikay");//assign unique keys value
	m.put(2, "Rai");
	m.put(3, "King");
	System.out.println(m);
	//m.remove(2);//removes keys and their values
	//m.clear();//removes all mappings
	//m.containsKey(5);//shows keys are present or not if not returns false
	//m.containsVlaue("Rai");//shows value present in the list same as above
	//m.entrySet();//shows key and their values
	//m.get(3);//returns the value of the key
	//m.isEmpty();shows list is empty or not returns false is not 
	//m.keySet();//print the total keys without their value
	//m.size();//shows size 
	//m.values();//print the values without keys 
	System.out.println(m.values());
	
}
}
