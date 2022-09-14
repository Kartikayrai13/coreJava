package CollectionsPrachiMam;

import java.util.Comparator;
import java.util.*;

public class Employee {
private String Fname;
private String Lname;
private int id;

public String getFname() {
	return Fname;
}

public void setFname(String fname) {
	Fname = fname;
}

public String getLname() {
	return Lname;
}

public void setLname(String lname) {
	Lname = lname;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String toString() {
	return this.Fname+" "+this.Lname+" "+this.id;
}

}
