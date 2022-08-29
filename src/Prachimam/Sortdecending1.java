
package Prachimam;

import java.util.Arrays;

import java.util.Collections;

public class Sortdecending1 {
	public static void main(String[] args) {
		Integer [] abc={34,55,77,773,234,7765};
		Arrays.sort(abc,Collections.reverseOrder());
		System.out.println("Array elements in decending order"+Arrays.toString(abc));
	}
}
