package Java8;

import java.util.*;
public class ForEachMethod {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(12);
		l.add(45);
		l.add(33);
		l.add(122);
		l.add(43);
		
		l.forEach(li->System.out.println(li));//for each method with lamda 
		//it is same as for each loop and can be used in place of iterator.
		//for (Object object : l) {
			//System.out.println(object);//with for each loop
			
		}
	}

//}
