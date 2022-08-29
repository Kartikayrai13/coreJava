package Prachimam;

import java.util.Arrays;

public class Sortacending1 {
	public static void main(String[] args) {
		int[]abc=new int[]{23,33,56,76,75,22,54};
		Arrays.sort(abc);
		System.out.println("Elements of array sorted in acending order");
		
		for(int i=0;i<abc.length;i++){
			System.out.print(abc[i]+" ");
		}
	}
}
