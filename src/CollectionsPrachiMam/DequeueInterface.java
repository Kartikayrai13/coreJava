package CollectionsPrachiMam;

import java.util.ArrayDeque;

public class DequeueInterface {
public static void main(String[] args) {
	ArrayDeque a= new ArrayDeque();
	a.add(12);
	a.add('d');
	a.add("Vijay");
	System.out.println(a);
	a.addFirst('d');
	a.addLast(5);
	System.out.println(a);
	a.removeFirst();
	a.removeLast();
	System.out.println(a);
}
}
