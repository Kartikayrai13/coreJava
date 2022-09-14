package CollectionsPrachiMam;

import java.util.Comparator;

public class EmployeeByNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int i=o1.getFname().compareTo(o2.getFname());
		if(i==0){
			i=o1.getLname().compareTo(o2.getLname());
		}
		return i;
	}
	
}
