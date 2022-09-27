package Java8;

public class TestFunctional1 {
	public static void main(String[] args) {
	
	Functional1 f=(a,b)->{
		System.out.println("lamda used");
		return a+b;
	};
	Functional1 f1=(a,b)->{
		System.out.println("2nd lamda function");
		return a*b;
	};
	
	System.out.println("add:-"+f.add(12,12));
	System.out.println("Multiply:-"+f1.add(12, 12));
}
}
