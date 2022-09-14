package CollectionsPrachiMam;

public class EqualsAndHashCode {
public static void main(String[] args) {
	String s="Java";
	//String s1="JavaScript";
	String s1="Java";
	System.out.println(s.equals(s1));
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	/*if value of the attributes are same the equals will return true and hashCode will be same
	and if not then equals will return false and hashCode will be different*/
}
}
