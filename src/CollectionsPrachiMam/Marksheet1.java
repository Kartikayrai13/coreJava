package CollectionsPrachiMam;

import java.util.Comparator;

public class Marksheet1 implements Comparable<Marksheet1> {
	private String Fname;
	private String lname;
	private String rollNo;
	private int phys;
	private int chem;
	private int maths;
	
	public Marksheet1() {
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getPhys() {
		return phys;
	}

	public void setPhys(int phys) {
		this.phys = phys;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public int compareTo(Marksheet1 m) {
		//return rollNo.compareTo(m.rollNo);
		return rollNo.compareTo(m.rollNo);
	}
	public String toString() {
		return rollNo+" "+Fname+" "+lname+" "+phys+" "+chem+" "+maths;
	}

}
