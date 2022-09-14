package CollectionsPrachiMam;
import java.util.*;
public  class Marksheet implements Comparable<Marksheet> {
	public String rollNo;
	public String name;
	public int marks;

	public Marksheet() {
	}
	public Marksheet(String r,String n,int m){
		this.rollNo=r;
		this.name=n;
		this.marks=m;
	}
	public int compareTo(Marksheet m){
		return rollNo.compareTo(m.rollNo);
		//return name.compareTo(m.name);
		//return marks.compareTo(m.marks);
	}
	public String toString(){
		return rollNo+","+name+","+marks;
	}
	
	
	/*public static void main(String[] args) {
		List l=new ArrayList();
		Marksheet m1=new Marksheet();
		l.add(m1);
		Marksheet m2=new Marksheet();
		l.add(m2);
		//l.contains(m2);
		//l.remove(m2);
		//both contains and remove uses same equals methods to compare elements 
	*/
	/*public boolean equals(Object o){//will be used with sorting 
		if (o==null)
			return false;
		if(!(o instanceof Marksheet))
			return false;
		Marksheet other=(Marksheet) o;
		//return.this.getRollNo().equals((other).getRollNo());
		*/
		
}

	//}

