package CollectionsPrachiMam;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		//Queue q=new LinkedList();
		PriorityQueue q=new PriorityQueue<>();
		q.add(12);
		q.add(3);
		q.add(5);
		//q.add("Vijay");
		//q.offer(5);//insert element into the queue and returns true if inserted
		//q.poll();//removes elements on a random basis
		//q.peek();//returns the elements as it is
		//q.remove();//removes element in order from 1st   
		//q.remove(12);//removes the mentioned elements
		//q.element();//returns the total elements in the list
		//add remove and element method throws exception and poll peek offer returns null
		System.out.println(q);
	
		System.out.println(q);
	}
}
