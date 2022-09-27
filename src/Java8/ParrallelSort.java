package Java8;

import java.util.Arrays;

public class ParrallelSort {
	public static void main(String[] args) {
		int[] i= {23,43,54,5,7,74};
		//Arrays.sort(i);
		Arrays.parallelSort(i);
		System.out.println(Arrays.toString(i));
		
		//for (int j : i) {
			//System.out.println(j);
		}
		
	}

//}
