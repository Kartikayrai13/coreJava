package Java8;

import java.util.ArrayList;

public class Stream1 {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(12);
	l.add(34);
	l.add(23);
	l.add(45);
	l.add(49);
	l.add(67);
	l.add(12);
	l.add(34);
	l.add(23);
	l.add(45);
	l.add(49);
	l.add(67);

	
	//l.stream().distinct().forEach(e->System.out.println(e));;
	l.stream().sorted().distinct().forEach(e->System.out.println(e));

}
}
