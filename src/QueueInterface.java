package CollectionsPrachiMam;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(12);
		q.add(3.5);
		q.add('f');
		//q.add("Vijay");
		//q.offer(5);//insert element into the queue and returns true if inserted
		//q.poll();//gives first element of the queue
		//q.peek();
		//q.remove(element);//removes element and if removed returns true
		System.out.println(q);
	}
}
