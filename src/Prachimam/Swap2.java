package Prachimam;

public class Swap2 {
	public static void main(String[] args) {
		int first=2;
		int second=3;
		System.out.println("Before swapping");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("After swapping");
		System.out.println("first number="+first);
		System.out.println("second number="+second);
		
		
	}

}
