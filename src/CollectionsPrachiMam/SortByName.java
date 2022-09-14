package CollectionsPrachiMam;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFname().compareTo(o2.getFname());
	}

}
